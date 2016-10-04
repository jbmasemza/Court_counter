package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    int scoreTeamA = 0;

    int scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForTeamA(0);
        displayForTeamB(0);
    }

    /*
    Increase Team A score by 3
     */
    public void addThreeToTeamA(View view)
    {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /*
     Increase Team B score by 3
      */
    public void addThreeToTeamB(View view)
    {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /*
    Increase Team A score by 2
     */
    public void addTwoToTeamA(View view)
    {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /*
  Increase Team B score by 2
   */
    public void addTwoToTeamB(View view)
    {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /*
    Increase Team A score by 1
     */
    public void addIOneToTeamA(View view)
    {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /*
    Increase Team B score by 1
     */
    public void addIOneToTeamB(View view)
    {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /*
   *Reset the scores for both teams
    */
    public void resetScore(View view)
    {
       scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /*
    Display score for Team A
     */
    public void displayForTeamA(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    //Display score for Team B
    public void displayForTeamB(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
