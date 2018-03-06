package com.example.android.financialbankingawarenessquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int totalPoints;
    RadioButton question1Answer2;
    RadioButton question2Answer4;
    RadioButton question3Answer3;
    RadioButton question4Answer1;
    RadioButton question5Answer3;
    RadioButton question6Answer1;
    RadioButton question7Answer3;
    RadioButton question8Answer3;
    RadioButton question10Answer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int countPoints() {
        totalPoints = 0;
        // Correct buttons set up to count
        question1Answer2 = findViewById(R.id.q1_ans_false);
        question2Answer4 = findViewById(R.id.q2_answer4);
        question3Answer3 = findViewById(R.id.q3_answer3);
        question4Answer1 = findViewById(R.id.q4_answer1);
        question5Answer3 = findViewById(R.id.q5_answer3);
        question6Answer1 = findViewById(R.id.q6_ans_ashley);
        question7Answer3 = findViewById(R.id.q7_answer3);
        question8Answer3 = findViewById(R.id.q8_answer3);
        question10Answer2 = findViewById(R.id.q10_answer2);
        /**
         * Implemented for readability.
         */
        CheckBox question9Answer2 = findViewById(R.id.q9_answer2);
        boolean hasQuestion9Answer2 = question9Answer2.isChecked();
        Log.v("MainActivity", "Uncorrect q9Option1: " + hasQuestion9Answer2);

        /**
         * This code count questions if are true.
         */
        CheckBox question9Answer1 = findViewById(R.id.q9_answer1);
        boolean hasQuestion9Answer1 = question9Answer1.isChecked();
        Log.v("MainActivity", "Correct q9Option1: " + hasQuestion9Answer1);

        CheckBox question9Answer3 = findViewById(R.id.q9_answer3);
        boolean hasQuestion9Answer3 = question9Answer3.isChecked();
        Log.v("MainActivity", "Correct q9Option1: " + hasQuestion9Answer3);

        if (hasQuestion9Answer1 && hasQuestion9Answer3 && !hasQuestion9Answer2)
            totalPoints += 1;

        if (question1Answer2.isChecked())
            totalPoints += 1;
        Log.v("MainActivity", "Correct question1Answer2: " + question1Answer2.isChecked());

        if (question2Answer4.isChecked())
            totalPoints += 1;
        Log.v("MainActivity", "Correct question2Answer4: " + question2Answer4.isChecked());

        if (question3Answer3.isChecked())
            totalPoints += 1;
        Log.v("MainActivity", "Correct question3Answer3: " + question3Answer3.isChecked());

        if (question4Answer1.isChecked())
            totalPoints += 1;
        Log.v("MainActivity", "Correct question4Answer1: " + question4Answer1.isChecked());

        if (question5Answer3.isChecked())
            totalPoints += 1;
        Log.v("MainActivity", "Correct question5Answer3: " + question5Answer3.isChecked());

        if (question6Answer1.isChecked())
            totalPoints += 1;
        Log.v("MainActivity", "Correct question6Answer1: " + question6Answer1.isChecked());

        if (question7Answer3.isChecked())
            totalPoints += 1;
        Log.v("MainActivity", "Correct question7Answer3: " + question7Answer3.isChecked());

        if (question8Answer3.isChecked())
            totalPoints += 1;
        Log.v("MainActivity", "Correct question8Answer3: " + question8Answer3.isChecked());

        if (question10Answer2.isChecked())
            totalPoints += 1;
        Log.v("MainActivity", "Correct question10Answer2: " + question10Answer2.isChecked());

        return totalPoints;
    }

    public void displayPoints(View view) {
        String message;
        int totalPoints = countPoints();

        if (totalPoints <= 3) {
            message = "You need to practice!";
        } else if (totalPoints <= 6) {
            message = "Not bad!";
        } else if (totalPoints <= 9) {
            message = "Almost!";
        } else {
            message = "You are the best!";
        }
        Toast.makeText(getApplicationContext(), "Your score is " + totalPoints + "! " + message, Toast.LENGTH_LONG).show();
    }
}
