package com.example.inclassassignment08_thomass;


public class Question {

    public int location;
    public int question;
    public int photoId;
    public int link;
    public boolean answer;


    public int getLocation() { //Getter methods returning values
        return location;
    }

    public void setLocation(int location) { //Setter method and integer location
        this.location = location;
    }

    public int getQuestion() {
        return question;
    }

    public void setQuestion(int question) {
        this.question = question;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public boolean getsTrue() {
        return answer;
    }

    public void setTrue(boolean answer) { //Toast!
        this.answer = answer;
    }

    public int getsLink() {
        return link;
    }

    public void setLink(int link) { //Toast!
        this.link = link;
    }

    public Question(int location, int question, int photoId, int link, boolean answer) { //getters and setters
        this.location = location;
        this.question = question;
        this.photoId = photoId;
        this.link = link;
        this.answer = answer
        ;
    }

}
