package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int ghanaScore = 0;
int nigeriaScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //---------------GAHANA------------
    public void ghanaFreeKickGoals(View view){
        ghanaScore = ghanaScore + 10;

        displayStatisticsForGhana(ghanaScore);
    }

    public void ghanaPenaltyGoals(View view){
        ghanaScore = ghanaScore + 5;
        displayStatisticsForGhana(ghanaScore);
    }

    public void ghanaFouls(View view){
        ghanaScore = ghanaScore -2;
        displayStatisticsForGhana(ghanaScore);
    }
    //--------------------------------------------
    //---------------NIGERIA------------
    public void nigeriaFreeKickGoals(View view){
        nigeriaScore = nigeriaScore + 10;
        displayStatisticsForNigeria(nigeriaScore);
    }

    public void nigeriaPenaltyGoals(View view){
        nigeriaScore = nigeriaScore + 5;
        displayStatisticsForNigeria(nigeriaScore);
    }

    public void nigeriaFouls(View view){
        nigeriaScore = nigeriaScore -2;
        displayStatisticsForNigeria(nigeriaScore);
    }
    //----------------RESET GAME METHOD==============
    public void resetGame(View view){
        ghanaScore =0;
        nigeriaScore =0;
        displayStatisticsForNigeria(nigeriaScore);
        displayStatisticsForGhana(ghanaScore);
    }
    //-----------------------------------------------------------------------
    private void displayStatisticsForGhana(int points) {
        TextView displayMessageTextView = (TextView) findViewById(R.id.ghanaScores_id);
        displayMessageTextView.setText("" + points);
    }

    private void displayStatisticsForNigeria(int points) {
        TextView displayMessageTextView = (TextView) findViewById(R.id.nigeriaScores_id);
        displayMessageTextView.setText("" + points);
    }
/**
    private void displayScorePercentageForGhana(String percent) {
        TextView displayMessageTextView = (TextView) findViewById(R.id.tex);
        displayMessageTextView.setText("" + percent);
    }
*/
}
