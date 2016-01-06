package com.designpatternsdemo.dataaccessobjectpattern.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.designpatternsdemo.R;
import com.designpatternsdemo.dataaccessobjectpattern.dataaccessobject.TrackDO;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Avinash
 */
public class DAOActivity extends AppCompatActivity{

    private JSONArray array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.dao);
        try {
            array = new JSONArray(getResources().getString(R.string.json));
        } catch (JSONException e) {
        }

        List<TrackDO> entriesList = new ArrayList<>();
        for (int i = 0; i < array.length(); i++) {
            try {
                entriesList.add(new TrackDO(array.getJSONObject(i)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        ((TextView)findViewById(R.id.txt)).setText(getText(entriesList));


    }

    private String getText(List<TrackDO> entriesList) {
        String string = "";
        for (int i=0; i<entriesList.size(); i++) {
            try {
                string = string + "\n" + entriesList.get(i).get("name");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return string;
    }
}
