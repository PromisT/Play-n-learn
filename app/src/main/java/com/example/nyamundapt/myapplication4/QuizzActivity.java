package com.example.nyamundapt.myapplication4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class QuizzActivity extends AppCompatActivity {
    Button b1, b2, b3;
   private int id = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz);

        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
    }

    public void b1(View view) {
        String title = getIntent().getStringExtra("Food");
        getSupportActionBar().setTitle(title);

        Intent intent = new Intent(QuizzActivity.this, MainActivity.class);
        id = b1.getId();
        intent.putExtra("button",id);
        startActivity(intent);
    }

    public void b2(View view) {
        Intent intent = new Intent(QuizzActivity.this, MainActivity.class);
        id = b2.getId();
        intent.putExtra("button",id);
        startActivity(intent);
    }

    public void b3(View view) {
        //String title = getIntent().getStringExtra("Animal");
       // getSupportActionBar().setTitle(title);

        Intent intent = new Intent(QuizzActivity.this, MainActivity.class);
        id = b3.getId();
        intent.putExtra("button",id);
        startActivity(intent);
    }
}