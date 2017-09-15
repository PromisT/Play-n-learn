package com.example.nyamundapt.myapplication4;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.Questions;

public class MainActivity extends AppCompatActivity {
    //class that contains questions n answers
    private Questions mQuestions = new Questions();
    private QuestionH mQuestionH = new QuestionH();
    private QuestionF mQuestionF = new QuestionF();
    private Toolbar Toolbar;

    TextView score, question;
    Button Choice1, Choice2, Choice3;

    private ImageView mPicView;
    //  Button b1,b2,b3;

    private String mAnswer;
    private String correctAnswers="";
    private String[] answers = new String[mQuestions.getLength()];
    ;
    private int mScore = 0;
    private int mQuestionNumber = 0;
    //public int mQuestionsLength = mQuestions.mQuestions.length;
    //public int mQuestionHLength = mQuestionH.mQuestionH.length;
    //public int mQuestionFLength = mQuestionF.mQuestionF.length;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //
        // setSupportActionBar();
        mPicView = (ImageView) findViewById(R.id.PicView);
        Choice1 = (Button) findViewById(R.id.choice1);
        Choice2 = (Button) findViewById(R.id.choice2);
        Choice3 = (Button) findViewById(R.id.choice3);


        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);
        updateQuestion();
        updateScore(mScore);


        //Start of button listener for Button 1
        //Start of Button Listener for Button1
        Choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Logic for Button goes in here
                if (Choice1.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    //This line of code is optional
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        Choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Logic for Button goes in here
                if (Choice2.getText() == mAnswer) {
                    mScore = mScore + 1;

                    updateScore(mScore);
                    updateQuestion();

                    //This line of code is optional
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        //End of Button Listener for Button2

        //Start of Button Listener for Button3
        Choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Logic for Button goes in here
                if (Choice3.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    //This line of code is optional
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
    }

    //End of Button Listener for Button3
    public void updateQuestion() {

        //if (mQuestionNumber<mQuestions.getLength())

        Intent intent = getIntent();
        int buttonId = intent.getIntExtra("button", 0);
        if (buttonId == R.id.b1) {
            try {
                mPicView.setImageResource(R.drawable.download23);
                question.setText(mQuestions.getQuestion(mQuestionNumber));
                Choice1.setText(mQuestions.getChoice1(mQuestionNumber));
                Choice2.setText(mQuestions.getChoice2(mQuestionNumber));
                Choice3.setText(mQuestions.getChoice3(mQuestionNumber));

                mAnswer = mQuestions.getCorrectAnswer(mQuestionNumber);
                correctAnswers = correctAnswers+"\n"+mAnswer;;
                mQuestionNumber++;

            } catch (IndexOutOfBoundsException e) {
                finalscore();
            }
        } else if (buttonId == R.id.b2) {
            try {
                mPicView.setImageResource(R.drawable.download4);
                question.setText(mQuestionH.getQuestion(mQuestionNumber));
                Choice1.setText(mQuestionH.getChoice1(mQuestionNumber));
                Choice2.setText(mQuestionH.getChoice2(mQuestionNumber));
                Choice3.setText(mQuestionH.getChoice3(mQuestionNumber));

                mAnswer = mQuestionH.getCorrectAnswer(mQuestionNumber);

                correctAnswers = correctAnswers+"\n"+mAnswer;
                mQuestionNumber++;

            } catch (IndexOutOfBoundsException e) {
                finalscore();
            }
        } else if (buttonId == R.id.b3) {
            try {
                mPicView.setImageResource(R.drawable.pic0);
                question.setText(mQuestionF.getQuestion(mQuestionNumber));
                Choice1.setText(mQuestionF.getChoice1(mQuestionNumber));
                Choice2.setText(mQuestionF.getChoice2(mQuestionNumber));
                Choice3.setText(mQuestionF.getChoice3(mQuestionNumber));

                mAnswer = mQuestionF.getCorrectAnswer(mQuestionNumber);
                correctAnswers = correctAnswers+"\n"+mAnswer;
                mQuestionNumber++;

            } catch (IndexOutOfBoundsException e) {
                finalscore();
            }
        }
    }

    public void updateScore(int mScore) {
        //mScore = mScore + 1;
        score.setText("Score: " + this.mScore);
    }

    private void finalscore() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setMessage("View Results?");
        alertDialogBuilder.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(MainActivity.this, FinalScoreActivity.class);
                        intent.putExtra("score", mScore);
                        intent.putExtra("answer", correctAnswers);
                        startActivity(intent);
                    }
                });
        alertDialogBuilder.setNegativeButton(" Cancel",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }

                });
        alertDialogBuilder.show();
    }


}
