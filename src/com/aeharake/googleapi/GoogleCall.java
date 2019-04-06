package com.aeharake.googleapi;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.aeharake.googleapi.models.GoogleImageModel;
import com.aeharake.googleapi.network.OkHttpManager;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class GoogleCall{
	private String url;
	private String link = "https://www.google.com/search?source=lnms&tbm=isch&sa=X&q=%s";
	public static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/46.0.2490.4 Safari/537.36";

	public interface Callback {
		void onResponse(ArrayList<GoogleImageModel> googleImages);

		void onFailure(Exception ex);

	}

	public GoogleCall(String keywords, Tools tools) {
		keywords = keywords.replaceAll("\\s+", "+");
		this.url = String.format(this.link, keywords).concat(tools.toString());
	}

	public void execute(final Callback callback) {
		OkHttpClient okHttpClient = OkHttpManager.getInstance();
		Request request = new Request.Builder().url(url).addHeader("User-Agent", USER_AGENT)
				.addHeader("Host", "www.google.com").addHeader("Referer", "https://images.google.com/")
				.addHeader("Accept", "text/html").addHeader("Connection", "keep-alive")
				/* .addHeader("Accept-Encoding", "gzip, deflate, br") */.addHeader("Accept-Language", "en-US,en;q=0.8")
				.build();
		okHttpClient.newCall(request).enqueue(new okhttp3.Callback() {

			@Override
			public void onFailure(Call arg0, IOException e) {
				callback.onFailure(e);
			}

			@Override
			public void onResponse(Call call, okhttp3.Response response) throws IOException {
				try {
					String body = response.body().string();
					Document doc = Jsoup.parse(body);
					Elements elements = doc.getElementsByAttributeValue("class", "rg_bx rg_di rg_el ivg-i");
					ArrayList<GoogleImageModel> googleImages = new ArrayList<>();
					for (Element e : elements) {
						Elements rg_metas = e.getElementsByAttributeValue("class", "rg_meta notranslate");
						if (rg_metas.size() == 0)
							throw new Exception("No images found");
						Element rg_meta = rg_metas.get(0);
						 System.out.println(rg_meta.text());
						Gson gson = new Gson();
						GoogleImageModel googleImage = gson.fromJson(rg_meta.text(), GoogleImageModel.class);
						googleImages.add(googleImage);
					}
					callback.onResponse(googleImages);
				} catch (JsonSyntaxException e) {
					callback.onFailure(e);
					e.printStackTrace();
				} catch (Exception e) {
					callback.onFailure(e);
					e.printStackTrace();
				}

			}
		});

	}

}
