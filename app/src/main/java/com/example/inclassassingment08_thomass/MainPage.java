package com.example.inclassassingment08_thomass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainPage extends AppCompatActivity {

    public List<Question> questions; //Connects to the intialData method
    private QuestionsAdapter questionAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        initialData();

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        questionAdapter = new QuestionsAdapter(questions, this);
        recyclerView.setAdapter(questionAdapter);
    }


    public void initialData() {
        questions = new ArrayList<>(); //This is calling the global array variable
        questions.add(new Question(R.string.australia, R.string.question_australia, R.drawable.africa, R.string.google, true)); //linked to global array and Question class
        questions.add(new Question(R.string.americas, R.string.question_america, R.drawable.americas, R.string.google, false)); //linked to global array and Question class
        questions.add(new Question(R.string.asia, R.string.question_asia, R.drawable.asia, R.string.my_link, true)); //linked to global array and Question class
        questions.add(new Question(R.string.middle_east, R.string.question_mideast, R.drawable.mideast, R.string.google,true)); //linked to global array and Question class
        questions.add(new Question(R.string.ocean, R.string.question_oceans, R.drawable.oceans, R.string.my_link,true));


    }
/*    private void checkAnswer(boolean userPressedTrue) { //method - if user pressed true
        boolean answerIsTrue = questions.get(merp).answer;
        int messageResId;

        if (answerIsTrue) { // id this is true this will be the toast message
            messageResId = R.string.judgement_toast;
        } else if (userPressedTrue == answerIsTrue) { //variable
            messageResId = R.string.correct_toast; //answer is true - toast is true
        } else {
            messageResId = R.string.incorrect_toast;
        }
    }*/
}
