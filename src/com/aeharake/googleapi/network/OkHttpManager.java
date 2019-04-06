package com.aeharake.googleapi.network;

import okhttp3.OkHttpClient;
/**
 * 
 * @author A7
 *
 */
public class OkHttpManager {

	private volatile static OkHttpClient okHttpClient;

	private OkHttpManager() {

	}
	
	public static synchronized OkHttpClient getInstance() {
		if (okHttpClient == null)
			okHttpClient = new OkHttpClient();
		return okHttpClient;
	}

}
