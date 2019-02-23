package com.notixia.whh.mytestapplication.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.notixia.whh.mytestapplication.R;
import com.notixia.whh.mytestapplication.injection2.NetworkApi;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class Test2Activity extends Activity {

    @Inject
    NetworkApi networkApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_2);
        boolean injected = networkApi == null ? false : true;
        TextView userAvailable = findViewById(R.id.target);
        userAvailable.setText("Dependency injection worked: " + String.valueOf(injected));
    }
}
