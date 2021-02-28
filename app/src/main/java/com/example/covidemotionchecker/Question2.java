package com.example.covidemotionchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        final RadioButton yesevent = findViewById(R.id.radioButton4);
        final RadioButton noevent = findViewById(R.id.radioButton5);
        yesevent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Emotion.addanxious();
                Intent intent = new Intent(getBaseContext(), Question3.class);
                startActivity(intent);
            }
        });
        noevent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Emotion.addnormal();
                Intent intent = new Intent(getBaseContext(), Question3.class);
                startActivity(intent);
            }
        });
    }
}