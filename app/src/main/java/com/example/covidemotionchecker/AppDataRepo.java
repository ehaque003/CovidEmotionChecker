package com.example.covidemotionchecker;

import android.provider.BaseColumns;

public class AppDataRepo {
    private AppDataRepo() {
    }

    public static class EmotionEntry implements BaseColumns {
        public static final String TABLE_NAME = "EMOTION_SCORE";
        public static final String COLUMN_NAME_DATETIME = "Time";
        public static final String COLUMN_NAME_FINAL_EMOTION = "FinalEmotion";
        public static final String COLUMN_NAME_ANXIOUS_SCORE = "Anxious";
        public static final String COLUMN_NAME_SAD_SCORE = "Sad";
        public static final String COLUMN_NAME_ANGER_SCORE = "Anger";
        public static final String COLUMN_NAME_HAPPY_SCORE = "Happy";
        public static final String COLUMN_NAME_NORMAL_SCORE = "Normal";
    }

    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + EmotionEntry.TABLE_NAME + " (" +
                    EmotionEntry._ID + " INTEGER PRIMARY KEY," +
                    EmotionEntry.COLUMN_NAME_DATETIME + " DATETIME," +
                    EmotionEntry.COLUMN_NAME_FINAL_EMOTION + " TEXT," +
                    EmotionEntry.COLUMN_NAME_ANXIOUS_SCORE + " INT," +
                    EmotionEntry.COLUMN_NAME_SAD_SCORE + " INT," +
                    EmotionEntry.COLUMN_NAME_ANGER_SCORE + " INT," +
                    EmotionEntry.COLUMN_NAME_HAPPY_SCORE + " INT," +
                    EmotionEntry.COLUMN_NAME_NORMAL_SCORE + " INT " +
                    ")";
//    create table team_score (columna int, colb text, colc datetime)

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + EmotionEntry.TABLE_NAME;

}