package com.example.inclassassignment08_thomass;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast; //Library imports

import com.example.inclassassingment08_thomass.R;

public class QuestionViewHolder extends RecyclerView.ViewHolder { //RecycleView is a subclass of ViewGroup that displays child views
    //Recycler view helps store memory by not loading everything

    public CardView cardView; //linked to card XML
    public TextView questionCountry;
    public TextView countryQuestion;
    public TextView questionAnswer;
    public TextView linkToSite;
    public ImageView countryImage; //Global and Public variables can be used throughout classes
    public Context context;
    public boolean userPressedTrue; //global can be called in Onclick

    //variable that holds spots




    public QuestionViewHolder(final View itemView, final Context context) { //View is only what is needed
        super(itemView); //inheritance
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        questionCountry = (TextView) itemView.findViewById(R.id.country_question);
        countryQuestion = (TextView) itemView.findViewById(R.id.question_country);
        countryImage = (ImageView) itemView.findViewById(R.id.country_image); //variables storing the information in XML
        linkToSite = (TextView) itemView.findViewById(R.id.link);


        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int toast = 0;  //local int

                // linkToSite.setText(Html.fromHtml(String.valueOf((text))));

                if (userPressedTrue) { // linked to adpater holder that holds the link to the Question class!

                    toast = R.string.correct_toast; //answer is true - toast is true

                } else {
                    toast = R.string.incorrect_toast;

                }
                Toast.makeText(context, toast, Toast.LENGTH_SHORT).show(); //int value
                linkToSite.setClickable(true);
                linkToSite.setMovementMethod(LinkMovementMethod.getInstance());
            }


        });

    }


    public void bind(final Question question) {
        //questionCountry.setSelected(question.answer);
        questionCountry.setText(question.question);
        countryQuestion.setText(question.location);
        countryImage.setImageResource(question.photoId);
        linkToSite.setText(question.link);
        bind(question);
    }
}










