package com.keithloughnane.whitelabelbikeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.keithloughnane.whitelabelbikeapp.BaseMainActivity;
import com.keithloughnane.whitelabelbikeapp.CommonOptions;
import com.keithloughnane.whitelabelbikeapp.R;

public class MainActivity extends BaseMainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //This for a larger project I'd use butterknife or rxBinding here
        findViewById(R.id.fancy_options).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CommonOptions.class);
                startActivity(intent);
            }
        });
    }
}