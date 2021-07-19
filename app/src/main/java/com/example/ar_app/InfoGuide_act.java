package com.example.ar_app;

import android.annotation.SuppressLint;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.transition.Explode;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class InfoGuide_act extends AppCompatActivity {
    private Vibrator myVib;
    Button btn_parrot, btn_balloon, btn_skel, btn_lung, btn_heart, btn_ss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        getWindow().setExitTransition(new Explode());

        setContentView(R.layout.infoguide);

        myVib = (Vibrator) this.getSystemService(VIBRATOR_SERVICE);
        btn_ss = (Button) findViewById(R.id.btn_ss);
        btn_balloon = (Button) findViewById(R.id.btn_balloon);
        btn_skel = (Button) findViewById(R.id.btn_skel);
        btn_lung = (Button) findViewById(R.id.btn_lung);
        btn_heart = (Button) findViewById(R.id.btn_heart);
        btn_parrot = (Button) findViewById(R.id.btn_parrot);
        final Context context = getApplicationContext();
        final CharSequence text = "ENJOY";
        final int duration = Toast.LENGTH_LONG;


        btn_ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InfoGuide_act.this, Planet4_SolarAct.class));

                myVib.vibrate(50);
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        btn_balloon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InfoGuide_act.this, Game_act.class);
                ActivityOptions options = ActivityOptions
                        .makeSceneTransitionAnimation(InfoGuide_act.this);
                startActivity(intent, options.toBundle());
                myVib.vibrate(50);
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        btn_skel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InfoGuide_act.this, First_act.class);
                ActivityOptions options = ActivityOptions
                        .makeSceneTransitionAnimation(InfoGuide_act.this);
                startActivity(intent, options.toBundle());
                myVib.vibrate(50);
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        btn_heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InfoGuide_act.this, Second_act.class);
                ActivityOptions options = ActivityOptions
                        .makeSceneTransitionAnimation(InfoGuide_act.this);
                startActivity(intent, options.toBundle());
                myVib.vibrate(50);
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        btn_lung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InfoGuide_act.this, Third_act.class);
                ActivityOptions options = ActivityOptions
                        .makeSceneTransitionAnimation(InfoGuide_act.this);
                startActivity(intent, options.toBundle());
                myVib.vibrate(50);
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });btn_parrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InfoGuide_act.this, Fourth_act.class);
                ActivityOptions options = ActivityOptions
                        .makeSceneTransitionAnimation(InfoGuide_act.this);
                startActivity(intent, options.toBundle());
                myVib.vibrate(50);
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

    }
}
