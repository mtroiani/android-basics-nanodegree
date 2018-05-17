package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreHomeTeam = 0;
    int scoreAwayTeam = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void display(int score, int id) {
        TextView scoreDisplay = (TextView) findViewById(id);
        scoreDisplay.setText("" + score);
    }

    public void addOneHomeTeam(View v) {
        scoreHomeTeam += 1;
        display(scoreHomeTeam, R.id.home_score);
    }

    public void addFiveHomeTeam(View v) {
        scoreHomeTeam += 5;
        display(scoreHomeTeam, R.id.home_score);
    }

    public void addOneAwayTeam(View v) {
        scoreAwayTeam += 1;
        display(scoreAwayTeam, R.id.away_score);
    }

    public void addFiveAwayTeam(View v) {
        scoreAwayTeam += 5;
        display(scoreAwayTeam, R.id.away_score);
    }

    public void resetBtn(View v) {
        scoreAwayTeam = 0;
        scoreHomeTeam = 0;
        display(scoreAwayTeam, R.id.away_score);
        display(scoreHomeTeam, R.id.home_score);
    }
}
