package com.example.android.musicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     Button b1, b2;
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);

        mediaPlayer = MediaPlayer.create(this,R.raw.test);
        b1.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        b2.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
            }
        });
    }


}
