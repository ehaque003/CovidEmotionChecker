package com.example.covidemotionchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EmergencyPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_page);
        final Button tohomepage = findViewById(R.id.button3);
        tohomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Emotion.sad=0;
                Emotion.happy=0;
                Emotion.anger=0;
                Emotion.anxious=0;
                Emotion.normal=0;
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}