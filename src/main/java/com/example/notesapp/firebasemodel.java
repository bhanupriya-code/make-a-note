package com.example.notesapp;

public class firebasemodel {
    //this name must be matched with the name used when we mapped the data into the database
    private String title;
    private String content;

    public firebasemodel(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public firebasemodel(){

    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
