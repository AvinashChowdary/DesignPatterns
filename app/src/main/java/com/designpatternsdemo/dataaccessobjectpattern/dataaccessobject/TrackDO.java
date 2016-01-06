package com.designpatternsdemo.dataaccessobjectpattern.dataaccessobject;

import android.content.Context;

import org.json.JSONObject;


public class TrackDO extends AbstractBaseDO {

	public static Context context;

	public TrackDO() {
		super();
	}

	public TrackDO(JSONObject jsonObjectToConstruct) throws org.json.JSONException {
		super(jsonObjectToConstruct);
	}

	public TrackDO(String jsonString) throws org.json.JSONException {
		super(jsonString);
	}
	public static Context getContext() {
		return context;
	}

	public static void setContext(Context context) {
		TrackDO.context = context;
	}
	
}
