    package com.bawp.audiobook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

    public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        button1= findViewById(R.id.button1);
        button2= findViewById(R.id.button2);
        button3= findViewById(R.id.button3);
        button4= findViewById(R.id.button4);
        button5= findViewById(R.id.button5);
        button6= findViewById(R.id.button6);
        button7= findViewById(R.id.button7);
        button8= findViewById(R.id.button8);
        button9= findViewById(R.id.button9);
        button10= findViewById(R.id.button10);
        button11= findViewById(R.id.button11);
        button12= findViewById(R.id.button12);
        button13= findViewById(R.id.button13);
        button14= findViewById(R.id.button14);
        button15= findViewById(R.id.button15);
        button16= findViewById(R.id.button16);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, playerScreen.class);
                intent.putExtra("Chapter",1);
                startActivity(intent);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, playerScreen.class);
                intent.putExtra("Chapter",2);
                startActivity(intent);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, playerScreen.class);
                intent.putExtra("Chapter",3);
                startActivity(intent);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, playerScreen.class);
                intent.putExtra("Chapter",4);
                startActivity(intent);

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, playerScreen.class);
                intent.putExtra("Chapter",5);
                startActivity(intent);

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, playerScreen.class);
                intent.putExtra("Chapter",6);
                startActivity(intent);

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, playerScreen.class);
                intent.putExtra("Chapter",7);
                startActivity(intent);

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, playerScreen.class);
                intent.putExtra("Chapter",8);
                startActivity(intent);

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, playerScreen.class);
                intent.putExtra("Chapter",9);
                startActivity(intent);

            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, playerScreen.class);
                intent.putExtra("Chapter",10);
                startActivity(intent);

            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, playerScreen.class);
                intent.putExtra("Chapter",11);
                startActivity(intent);

            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, playerScreen.class);
                intent.putExtra("Chapter",12);
                startActivity(intent);

            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, playerScreen.class);
                intent.putExtra("Chapter",13);
                startActivity(intent);

            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, playerScreen.class);
                intent.putExtra("Chapter",14);
                startActivity(intent);

            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, playerScreen.class);
                intent.putExtra("Chapter",15);
                startActivity(intent);

            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, playerScreen.class);
                intent.putExtra("Chapter",16);
                startActivity(intent);

            }
        });




    }


}