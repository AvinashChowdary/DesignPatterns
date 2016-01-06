package com.designpatternsdemo.dataaccessobjectpattern.dataaccessobject;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Avinash
 */
public class AbstractBaseDO {

    // jsonObject will hold our internal representation for easy communications
    // with HRN
    private JSONObject jsonObject;

    public AbstractBaseDO () {
        jsonObject = new JSONObject();
    }

    public AbstractBaseDO (JSONObject jsonObjectToConstruct) {
        jsonObject = jsonObjectToConstruct;
    }

    public AbstractBaseDO (String jsonString) throws org.json.JSONException {
        jsonObject = new JSONObject(jsonString);
    }

    // simple get accessor method for handling any object (cast the return value
    // as needed)
    public Object get (String fieldName) throws JSONException {
        return jsonObject.get(fieldName);
    }

    // simple get accessor method
    public String getString (String fieldName) throws JSONException {
        return jsonObject.getString(fieldName);
    }

    // method returns a string containing the child object's data in valid JSON
    // format
    public String toString () {
        return jsonObject.toString();
    }

    public JSONObject getJSONObject () {
        return jsonObject;
    }

    public void setJSONObject (String json) {
        try {
            jsonObject = new JSONObject(json);
        }
        catch (JSONException e) {
        }
    }
}
