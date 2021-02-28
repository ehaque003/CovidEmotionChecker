package com.example.covidemotionchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Question10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question10);
        final RadioButton no = findViewById(R.id.radioButton22);
        final RadioButton yes = findViewById(R.id.radioButton21);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Emotion.addanger();
                Emotion.addanger();
                Intent intent = new Intent(getBaseContext(), FinalEmotionGiven.class);
                startActivity(intent);
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), FinalEmotionGiven.class);
                startActivity(intent);
            }
        });
    }
}