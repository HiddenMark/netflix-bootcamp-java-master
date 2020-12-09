package com.everis.d4i.tutorial;

import java.time.LocalDate;
import java.util.Date;

public class Movie extends Content {
    private String director;
    private int releaseYear;

    public Movie() {

    }

    public Movie(String name, LocalDate visualizationDate, double score, long contentID,
                 String director, int releaseYear) {
        super(name, visualizationDate, score, contentID);
        this.director = director;
        this.releaseYear = releaseYear;

    }

    //Getters & Setters
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String toString() {
        return String.format("%s\nDirector: %s\nReleaseYear: %s\n",
                super.toString(),
                getDirector(),
                getReleaseYear());

    }
}
