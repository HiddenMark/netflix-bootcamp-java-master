package com.everis.d4i.tutorial;

import java.util.Date;

public class Documentary extends Content
{
    private String _director;
    private int _releaseYear;

    public Documentary()
    {

    }

    public Documentary(String name, Date visualizationDate, double score, long contentID,
                       String director, int releaseYear)
    {
        super(name, visualizationDate, score, contentID);
        _director = director;
        _releaseYear = releaseYear;
    }

    //Getters & Setters
    public String getDirector(){return _director;}
    public void setDirector(String director){ _director = director;}

    public int getReleaseYear(){ return _releaseYear; }
    public void setReleaseYear(int releaseYear){ _releaseYear = releaseYear; }


    public String toString()
    {
        return String.format("%s\nDirector: %s\nReleaseYear: %s\n",
                super.toString(),
                getDirector(),
                getReleaseYear());

    }
}
