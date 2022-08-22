package com.example.hello_world;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonBackground = findViewById(R.id.button1);
        final Button buttonTextColor = findViewById(R.id.button2);
        //final Button buttonTextCustom = findViewById(R.id.button3);
        final TextView helloWorld = findViewById(R.id.textView);
        findViewById(R.id.constraintLayout).setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
        int count = 0;
        buttonBackground.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (helloWorld.getCurrentHintTextColor() == getResources().getColor(android.R.color.holo_blue_dark)) {
                    findViewById(R.id.constraintLayout).setBackgroundColor(getResources().getColor(android.R.color.holo_orange_dark));
                    helloWorld.setHintTextColor(getResources().getColor(android.R.color.holo_orange_dark));
                }
                else {
                    findViewById(R.id.constraintLayout).setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
                    helloWorld.setHintTextColor(getResources().getColor(android.R.color.holo_blue_dark));
                }



            }
        });

        buttonTextColor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if( helloWorld.getCurrentTextColor() == getResources().getColor(android.R.color.white)) {
                    helloWorld.setTextColor(getResources().getColor(android.R.color.black));
                }
                else {
                    helloWorld.setTextColor(getResources().getColor(android.R.color.white));
                }
            }
        });
/*
        buttonTextCustom.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                helloWorld.setTextColor(getResources().getColor(R.color.teal_700));
            }
        }); */
    }
}









