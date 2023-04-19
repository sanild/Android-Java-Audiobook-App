package com.bawp.audiobook;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class playerScreen extends AppCompatActivity {
    MediaPlayer player;
    ImageButton playButton, pauseButton, stopButton;
    public Bundle extra;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        stopPlayer();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_screen);
        getSupportActionBar().hide();


        extra = getIntent().getExtras();

        playButton = findViewById(R.id.playbutton);
        pauseButton = findViewById(R.id.pausebutton);
        stopButton = findViewById(R.id.stopbutton);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v);
            }
        });

        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pause(v);
            }
        });

        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stop(v);
            }
        });

    }


    public void play(View v)
    {
        int i = extra.getInt("Chapter");
        switch (i){
            case 1:
                if (player == null){
                    player= MediaPlayer.create(this, R.raw.mysteryoflove);
                }
                player.start();
                break;
            case 2:
                if (player == null){
                    player= MediaPlayer.create(this, R.raw.endoftheroad);
                }
                player.start();
                break;
            case 3:
                if (player == null){
                    player= MediaPlayer.create(this, R.raw.farbehind);
                }
                player.start();
                break;
            case 4:
                if (player == null){
                    player= MediaPlayer.create(this, R.raw.guaranteed);
                }
                player.start();
                break;
            case 5:
                if (player == null){
                    player= MediaPlayer.create(this, R.raw.hardsun);
                }
                player.start();
                break;
            case 6:
                if (player == null){
                    player= MediaPlayer.create(this, R.raw.longnights);
                }
                player.start();
                break;
            case 7:
                if (player == null){
                    player= MediaPlayer.create(this, R.raw.society);
                }
                player.start();
                break;
            case 8:
                if (player == null){
                    player= MediaPlayer.create(this, R.raw.noceiling);
                }
                player.start();
                break;
            case 9:
                if (player == null){
                    player= MediaPlayer.create(this, R.raw.rise);
                }
                player.start();
                break;
            case 10:
                if (player == null){
                    player= MediaPlayer.create(this, R.raw.settingforth);
                }
                player.start();
                break;
            case 11:
                if (player == null){
                    player= MediaPlayer.create(this, R.raw.thewolf);
                }
                player.start();
                break;
            case 12:
                if (player == null){
                    player= MediaPlayer.create(this, R.raw.toulumne);
                }
                player.start();
                break;
            case 13:
                if (player == null){
                    player= MediaPlayer.create(this, R.raw.iburiedabone);
                }
                player.start();
                break;
            case 14:
                if (player == null){
                    player= MediaPlayer.create(this, R.raw.thebitterend);
                }
                player.start();
                break;
            case 15:
                if (player == null){
                    player= MediaPlayer.create(this, R.raw.thingsicannotrecall);
                }
                player.start();
                break;
            case 16:
                if (player == null){
                    player= MediaPlayer.create(this, R.raw.twotownsfromme);
                }
                player.start();
                break;


        }

    }

    public void pause(View v)
    {
        if (player!= null)
            player.pause();
    }

    public void stop(View v)
    {
        stopPlayer();
    }

    private void stopPlayer()
    {
        if (player != null)
        {
            player.release();
            player= null;
        }
    }
}