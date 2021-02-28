package com.example.covidemotionchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Question5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);
        final RadioButton great = findViewById(R.id.radioButton9);
        final RadioButton fine = findViewById(R.id.radioButton10);
        final RadioButton notgreat = findViewById(R.id.radioButton11);
        great.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Emotion.addhappy();
                Emotion.addhappy();
                Intent intent = new Intent(getBaseContext(), Question6.class);
                startActivity(intent);
            }
        });
        fine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Emotion.addnormal();
                Intent intent = new Intent(getBaseContext(), Question6.class);
                startActivity(intent);
            }
        });
        notgreat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Emotion.addsad();
                Intent intent = new Intent(getBaseContext(), Question6.class);
                startActivity(intent);
            }
        });
    }
}