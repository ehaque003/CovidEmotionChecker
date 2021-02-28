package com.example.covidemotionchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FinalEmotionGiven extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_emotion_given);
        TextView emotion = findViewById(R.id.textView);
        final Button tohomepage = findViewById(R.id.button2);
        int anger = Emotion.anger;
        int sad = Emotion.sad;
        int anxious = Emotion.anxious;
        int happy = Emotion.happy;
        int normal = Emotion.normal;
        String finalEmotion = null;
        if(anger >= sad && anger >= anxious && anger >= happy && anger >= normal){
            finalEmotion = "Anger";
            emotion.setText("You are feeling angry. Take a couple deep breaths, or perhaps count to ten, or punch a pillow. Different people have different ways of dealing with anger, you won't know yours unless you try!");
        }
        else if(sad >= anxious && sad >= happy && sad >= normal){
            finalEmotion = "Sad";
            emotion.setText("You are feeling depressed. Get good sleep at night, in the day time if you have to: sleep is essential. If you're going through a very difficult event (passing of a relative or loved person), try to think of things that make you happy!");
        }
        else if(anxious >= happy && anxious >= normal){
            finalEmotion = "Anxious";
            emotion.setText("You are feeling anxious. You shouldn't let fear get the best of you. If you need help, ask a therapist or a friend. But remember, this random app has got your back. ");
        }
        else if(happy >= normal){
            finalEmotion = "Happy";
            emotion.setText("You are feeling happy. Your energy and enjoyment of life is remarkable. There is nothing to say!");
        }
        else{
            finalEmotion = "Normal";
            emotion.setText("You are not experiencing any emotion. You have no traits that get the best of you. Keep it up!");
        }

        String finalEmotion1 = finalEmotion;
        tohomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                writeToDb(finalEmotion1, Emotion.anxious, Emotion.anger, Emotion.sad, Emotion.happy, Emotion.normal);
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

    private void writeToDb(String FinalEmotion, int anxious, int anger, int sad, int happy, int normal) {
        // Gets the data repository in write mode
        AppDataDBHelper dbHelper = new AppDataDBHelper(getBaseContext());
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(AppDataRepo.EmotionEntry.COLUMN_NAME_FINAL_EMOTION, FinalEmotion);
        values.put(AppDataRepo.EmotionEntry.COLUMN_NAME_ANXIOUS_SCORE, anxious);
        values.put(AppDataRepo.EmotionEntry.COLUMN_NAME_ANGER_SCORE, anger);
        values.put(AppDataRepo.EmotionEntry.COLUMN_NAME_SAD_SCORE, sad);
        values.put(AppDataRepo.EmotionEntry.COLUMN_NAME_HAPPY_SCORE, happy);
        values.put(AppDataRepo.EmotionEntry.COLUMN_NAME_NORMAL_SCORE, normal);
        long newRowId = db.insert(AppDataRepo.EmotionEntry.TABLE_NAME, null, values);
    }
}