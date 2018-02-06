package com.example.exam2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ScoreBoardActivity extends AppCompatActivity {
    private int TeamA_score = 0;
    private int TeamB_score = 0;
    private TextView mScoreATextView;
    private TextView mScoreBTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_board);

        mScoreATextView = (TextView) findViewById(R.id.TeamA_score);
        mScoreBTextView = (TextView) findViewById(R.id.TeamB_score);
    }

    public void onButtonClicked(View view) {
        switch (view.getId()) {
            case R.id.TeamA_score1:
                TeamA_score++;
                break;
            case R.id.TeamA_score2:
                TeamA_score += 2;
                break;
            case R.id.TeamA_score3:
                TeamA_score += 3;
                break;
            case R.id.TeamB_score1:
                TeamB_score++;
                break;
            case R.id.TeamB_score2:
                TeamB_score += 2;
                break;
            case R.id.TeamB_score3:
                TeamB_score += 3;
                break;
            case R.id.reset:
                TeamA_score = 0;
                TeamB_score = 0;
                break;
        }

        mScoreATextView.setText("" + TeamA_score);
        mScoreBTextView.setText("" + TeamB_score);
    }
}
