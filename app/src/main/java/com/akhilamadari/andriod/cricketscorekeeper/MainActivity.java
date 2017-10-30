package com.akhilamadari.andriod.cricketscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private int team_a_score = 0;
    private int team_b_score = 0;
    private int help_var_A = 0;
    private int help_var_B = 0;
    private int wickets = 0;
    private boolean wicket_A = false;
    private boolean wicket_B = false;
    private int wickets_B = 0;

    public void AddSixForA(View view) {
        help_var_A = 6;
        team_a_score = team_a_score + help_var_A;
        displayForTeamA(team_a_score);
    }

    public void AddFourForA(View view) {
        help_var_A = 4;
        team_a_score = team_a_score + help_var_A;
        displayForTeamA(team_a_score);
    }

    public void AddOneForA(View view) {
        help_var_A = 1;
        team_a_score = team_a_score + help_var_A;
        displayForTeamA(team_a_score);
    }

    public void AddWicketForA(View view) {
        wicket_A = true;
        wickets = wickets + 1;
        displayForTeamAW(wickets);
    }

    public void UndoForA(View view) {
        if (wicket_A == true) {
            wickets = wickets - 1;
            displayForTeamAW(wickets);
            wicket_A = false;
        } else {
            team_a_score = team_a_score - help_var_A;
            displayForTeamA(team_a_score);
            help_var_A = 0;
        }
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamAW(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_wicket);
        scoreView.setText(String.valueOf(score));
    }

    public void AddSixForB(View view) {
        help_var_B = 6;
        team_b_score = team_b_score + help_var_B;
        displayForTeamB(team_b_score);
    }

    public void AddFourForB(View view) {
        help_var_B = 4;
        team_b_score = team_b_score + help_var_B;
        displayForTeamB(team_b_score);
    }

    public void AddOneForB(View view) {
        help_var_B = 1;
        team_b_score = team_b_score + help_var_B;
        displayForTeamB(team_b_score);
    }

    public void AddWicketForB(View view) {
        wicket_B = true;
        wickets_B = wickets_B + 1;
        displayForTeamBW(wickets_B);
    }

    public void UndoForb(View view) {
        if (wicket_B == true) {
            wickets_B = wickets_B - 1;
            displayForTeamBW(wickets_B);
            wicket_B = false;
        } else {
            team_b_score = team_b_score - help_var_B;
            displayForTeamB(team_b_score);
            help_var_B = 0;
        }
    }

    public void resetScores(View view) {
        int zero1 = 0;
        team_a_score = 0;
        team_b_score = 0;
        help_var_A = 0;
        help_var_B = 0;
        wickets = 0;
        wicket_A = false;
        wicket_B = false;
        wickets_B = 0;
        displayForTeamA(zero1);
        displayForTeamAW(zero1);
        displayForTeamB(zero1);
        displayForTeamBW(zero1);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamBW(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_wicket);
        scoreView.setText(String.valueOf(score));
    }
}
