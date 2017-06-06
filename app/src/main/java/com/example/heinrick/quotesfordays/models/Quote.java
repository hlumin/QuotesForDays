package com.example.heinrick.quotesfordays.models;

/**
 * Created by Heinrick on 2017-06-02.
 */

public class Quote {

    private String quote;

    private String author;

    private String category;



    public String getBody() {
        return quote;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString(){
        return "\nContent: " + quote + "\nAuthor: " + author + "\ncategory: " + category;
    }



}
