package com.example.nyamundapt.myapplication4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FinalScoreActivity extends AppCompatActivity {
    TextView textscore,answer;
    Button mainmenu;
    private String answers ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_score);

        textscore = (TextView) findViewById(R.id.textscore);
        answer = (TextView) findViewById(R.id.answer);

        //receive the score from previous activity
        Intent intent = getIntent();
        int score = intent.getIntExtra("score" , 0);
        answers = intent.getStringExtra("answer");
        textscore.setText("Your Score:  " + score);





        //share preference to save the high score
      /*  SharedPreferences mypref = getPreferences(MODE_PRIVATE);
        int highscore = mypref.getInt("highestscore", 0);
        if (highscore >= score)
            highestscore.setText("High score: " + highscore);
        else {
            highestscore.setText("Correct Answers: " + score);
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("highscore", score);
            editor.commit();*/
    }
    public void answer(View view){
        answer.setText("Correct Answers"+answers);
    }



        public void mainmenu(View view) {
            Intent intent = new Intent(this, QuizzActivity.class);
            startActivity(intent);
        }
    }
