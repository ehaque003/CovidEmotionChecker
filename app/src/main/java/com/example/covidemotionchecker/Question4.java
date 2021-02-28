package com.example.covidemotionchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Question4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        final RadioButton ignoreit = findViewById(R.id.radioButton6);
        final RadioButton forgivethem = findViewById(R.id.radioButton7);
        final RadioButton scoldthem = findViewById(R.id.radioButton8);
        ignoreit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Emotion.addnormal();
                Emotion.addanxious();
                Intent intent = new Intent(getBaseContext(), Question5.class);
                startActivity(intent);
            }
        });
        forgivethem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Emotion.addhappy();
                Emotion.addnormal();
                Intent intent = new Intent(getBaseContext(), Question5.class);
                startActivity(intent);
            }
        });
        scoldthem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Emotion.addanger();
                Intent intent = new Intent(getBaseContext(), Question5.class);
                startActivity(intent);
            }
        });

    }
}