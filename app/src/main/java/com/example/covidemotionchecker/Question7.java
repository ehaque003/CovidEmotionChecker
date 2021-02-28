package com.example.covidemotionchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Question7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question7);
        final RadioButton yes = findViewById(R.id.radioButton15);
        final RadioButton no = findViewById(R.id.radioButton16);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Emotion.addanxious();
                Emotion.addsad();
                Intent intent = new Intent(getBaseContext(), Question8.class);
                startActivity(intent);
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Emotion.addnormal();
                Emotion.addhappy();
                Intent intent = new Intent(getBaseContext(), Question8.class);
                startActivity(intent);
            }
        });
    }
}