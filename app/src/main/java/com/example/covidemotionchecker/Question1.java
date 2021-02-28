package com.example.covidemotionchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        final RadioButton mosthours = findViewById(R.id.radioButton3);
        final RadioButton mediumhours = findViewById(R.id.radioButton2);
        final RadioButton smallhours = findViewById(R.id.radioButton);
        mosthours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Emotion.addhappy();
                Intent intent = new Intent(getBaseContext(), Question2.class);
                startActivity(intent);
            }

        });
        mediumhours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Emotion.addnormal();
                Intent intent = new Intent(getBaseContext(), Question2.class);
                startActivity(intent);
            }
        });
        smallhours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Emotion.addanger();
                Emotion.addanxious();
                Emotion.addsad();
                Intent intent = new Intent(getBaseContext(), Question2.class);
                startActivity(intent);
            }
        });


    }
}