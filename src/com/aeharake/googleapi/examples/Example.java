package com.aeharake.googleapi.examples;

import java.util.ArrayList;

import com.aeharake.googleapi.GoogleCall;
import com.aeharake.googleapi.Tools;
import com.aeharake.googleapi.models.GoogleImageModel;

public class Example {

	public static void main(String[] args) {
		Tools.ToolsBuilder toolsBuilder = new Tools.ToolsBuilder();
		Tools tools = toolsBuilder.color(Tools.ColorConstants.YELLOW).size().medium().time().lastWeek().build();

		String keywords = "ferrari";
		GoogleCall call = new GoogleCall(keywords, tools);
		call.execute(new GoogleCall.Callback() {

			@Override
			public void onResponse(ArrayList<GoogleImageModel> googleImages) {
				
			}

			@Override
			public void onFailure(Exception ex) {
						
			}
		});

	}

}
