package com.designpatternsdemo.facadepattern.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.designpatternsdemo.R;
import com.designpatternsdemo.facadepattern.Helpers.Configurations;

/**
 * Created by Avinash
 */
public class FacadeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facade);

        findViewById(R.id.iphone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.imei)).setText(getValue(0));
            }
        });

        findViewById(R.id.htc).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.imei)).setText(getValue(2));
            }
        });

        findViewById(R.id.oneplus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.imei)).setText(getValue(3));
            }
        });

        findViewById(R.id.samsung).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.imei)).setText(getValue(1));
            }
        });


    }

    private String getValue(int i) {

        Configurations config = new Configurations();
        switch (i) {
            case 0:
                return config.iphonePrice();
            case 1:
                return config.samsungPrice();
            case 2:
                return config.htcPrice();
            case 3:
                return config.onePlusPrice();
        }
        return "";
    }

}
