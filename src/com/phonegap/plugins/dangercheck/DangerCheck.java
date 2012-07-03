package com.phonegap.plugins.dangercheck;

import org.json.JSONArray;

import android.content.Intent;

import com.phonegap.api.Plugin;
import com.phonegap.api.PluginResult;

public class DangerCheck extends Plugin{

	@Override
	public PluginResult execute(String arg0, JSONArray arg1, String arg2) {

		Intent intentEncode = new Intent("com.phonegap.plugins.dangercheck.DangerCheck");
		this.ctx.startActivity(intentEncode);
		
		return null;
	}

}
