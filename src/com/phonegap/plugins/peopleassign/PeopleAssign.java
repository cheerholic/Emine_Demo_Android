package com.phonegap.plugins.peopleassign;

import org.json.JSONArray;

import android.content.Intent;

import com.phonegap.api.Plugin;
import com.phonegap.api.PluginResult;

public class PeopleAssign extends Plugin {

	public PeopleAssign() {
    }
	
	@Override
	public PluginResult execute(String action, JSONArray args, String callbackId) {
		
		Intent intentEncode = new Intent("com.phonegap.plugins.peopleassign.PeopleAssign");
		this.ctx.startActivity(intentEncode);
		
		return null;
	}

}
