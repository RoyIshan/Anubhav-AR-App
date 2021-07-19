package com.example.ar_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public class MainActivity extends Activity {
    static int TIME_OUT = 1200; //Time to launch the another activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            Intent i = new Intent(MainActivity.this, InfoGuide_act.class);
            startActivity(i);
            finish();
        }, TIME_OUT);
    }
}