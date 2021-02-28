package com.example.covidemotionchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Question8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question8);
        final RadioButton yes = findViewById(R.id.radioButton17);
        final RadioButton no = findViewById(R.id.radioButton18);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Emotion.addsad();
                Intent intent = new Intent(getBaseContext(), Question9.class);
                startActivity(intent);
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Emotion.addhappy();
                Emotion.addnormal();
                Intent intent = new Intent(getBaseContext(), Question9.class);
                startActivity(intent);
            }
        });
    }
}