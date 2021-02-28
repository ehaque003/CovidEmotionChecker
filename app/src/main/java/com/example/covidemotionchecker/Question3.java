package com.example.covidemotionchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Question3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        final RadioButton horrible = findViewById(R.id.horrble);
        final RadioButton notthatwell = findViewById(R.id.notthatwell);
        final RadioButton normal = findViewById(R.id.goingfine);
        horrible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Emotion.addanger();
                Emotion.addanger();
                Emotion.addsad();
                Emotion.addsad();
                Intent intent = new Intent(getBaseContext(), Question4.class);
                startActivity(intent);
            }
        });
        notthatwell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Emotion.addanger();
                Emotion.addsad();
                Intent intent = new Intent(getBaseContext(), Question4.class);
                startActivity(intent);
            }
        });
        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Emotion.addnormal();
                Emotion.addhappy();
                Intent intent = new Intent(getBaseContext(), Question4.class);
                startActivity(intent);
            }
        });


    }
}