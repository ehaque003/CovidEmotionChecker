package com.example.covidemotionchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Question6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question6);
        final RadioButton great = findViewById(R.id.radioButton12);
        final RadioButton okay = findViewById(R.id.radioButton13);
        final RadioButton notthatwell = findViewById(R.id.radioButton14);
        notthatwell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Emotion.addanxious();
                Emotion.addanxious();
                Emotion.addsad();
                Intent intent = new Intent(getBaseContext(), Question7.class);
                startActivity(intent);
            }
        });
        okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Emotion.addnormal();
                Intent intent = new Intent(getBaseContext(), Question7.class);
                startActivity(intent);
            }
        });
        great.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Emotion.addhappy();
                Intent intent = new Intent(getBaseContext(), Question7.class);
                startActivity(intent);
            }
        });


    }
}