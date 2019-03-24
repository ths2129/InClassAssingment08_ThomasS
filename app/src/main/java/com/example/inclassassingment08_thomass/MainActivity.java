package com.example.inclassassingment08_thomass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Question> questions; //Connects to the intialData method
    private QuestionsAdapter questionAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void Start (View view){
            Intent intent = new Intent(this, MainPage.class);
            startActivity(intent);
        }











/*
    public void addRandomQuestion(View view) {
        questions.add(getRandomQuestion());
        questionAdapter.notifyDataSetChanged();
    }
    private Question getRandomQuestion() {
        int num = (int) (Math.random() * 3);
        if (num == 0)
            return new Question(R.string.australia, R.string.question_australia, R.drawable.australia, true);
        else if (num == 1)
            return new Question(R.string.australia, R.string.question_australia, R.drawable.africa, true);
        else
            return new Question(R.string.australia, R.string.question_australia, R.drawable.americas, true);
    }*/
}

