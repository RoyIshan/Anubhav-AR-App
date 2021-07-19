package com.example.ar_app;

import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class GameReplay extends AppCompatActivity {
    private Vibrator myVib;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_replay);

        View view_replay;
        myVib = (Vibrator) this.getSystemService(VIBRATOR_SERVICE);
        view_replay = (View) findViewById(R.id.view_replay);
        view_replay.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View v, MotionEvent event){

                myVib.vibrate(50);
                startActivity(new Intent(GameReplay.this, Game_act.class));
                return false;
            }

            });


    }
}
