package com.example.inclassassingment08_thomass;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

 //Connects to the intialData method

//An adapter in the "middle man" from the Viewholder to the cardview


public class QuestionsAdapter extends RecyclerView.Adapter<QuestionViewHolder> { //RecycleView is a subclass of ViewGroup that displays child views
    //questions adapted to the View in XML
    public List<Question> questions;
    public Context context;

    public QuestionsAdapter(List<Question> questions, Context context) { //constructor
        this.questions = questions;
        this.context = context; //Array and context
    }


    @Override
    public QuestionViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) { //this is a parent view being reference // ViewGroup is the parent
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view_country, viewGroup, false); //takes style but doesn't add it False
        return new QuestionViewHolder(view, context); //returns the constructos inflated view
    }

    @Override
    public void onBindViewHolder(QuestionViewHolder holder, int viewType) { //binds values to cardView
        Question question = questions.get(viewType);
        holder.countryQuestion.setText(question.question);
        holder.questionCountry.setText(question.location);
        holder.linkToSite.setText(question.link);
        //holder.linkToSite = question.link;
        holder.countryImage.setImageResource(question.photoId);
        //holder.questionAnswer.setText(question.answer); BANE of my existence
        holder.userPressedTrue = question.answer;


    }

    @Override
    public int getItemCount() {
       return questions.size();
    }

}


