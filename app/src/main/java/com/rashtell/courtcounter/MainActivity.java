package com.rashtell.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView teamAScoreTextView;
    TextView teamBScoreTextView;

    int teamAScore;
    int teamBScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamAScoreTextView = (TextView) findViewById(R.id.teamAScoreTextView);
        teamBScoreTextView = (TextView) findViewById(R.id.teamBScoreTextView);

        teamAScore = Integer.parseInt((String)
                 ((TextView) findViewById(R.id.teamAScoreTextView))
                         .getText());

        teamBScore = Integer.parseInt((String)
                ((TextView) findViewById(R.id.teamBScoreTextView))
                        .getText());
    }

    public void ThreePointsButton(View view) {
        if (view.getId() == R.id.teamAThreePointsButton){
            teamAScore = teamAScore + 3;
        }else if(view.getId() == R.id.teamBThreePointsButton){
            teamBScore = teamBScore + 3;
        }else {}

        displayScore(teamAScore, teamBScore);
    }

    public void TwoPointsButton(View view) {
        if (view.getId() == R.id.teamATwoPointsButton){
            teamAScore = teamAScore + 2;
        }else if(view.getId() == R.id.teamBTwoPointsButton){
            teamBScore = teamBScore + 2;
        }

        displayScore(teamAScore, teamBScore);
    }

    public void FreeThrowButton(View view) {
        if (view.getId() == R.id.teamAFreeThrowButton){
            teamAScore = teamAScore + 1;
        }else if(view.getId() == R.id.teamBFreeThrowButton){
            teamBScore = teamBScore + 1;
        }

        displayScore(teamAScore, teamBScore);
    }

    private void displayScore(int teamAScore, int teamBScore){
        teamAScoreTextView.setText(Integer.toString(teamAScore));
        teamBScoreTextView.setText(Integer.toString(teamBScore));
    }

    public void ResetScores(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayScore(teamAScore, teamBScore);
    }
}
