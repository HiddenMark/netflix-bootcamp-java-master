package com.everis.d4i.tutorial;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Content {
    private String name;
    private LocalDate visualizationDate;
    private Double score;
    private long contentID;

    public Content() {

    }

    public Content(String name, LocalDate visualizationDate, double score, long contentID) {
        this.name = name;
        this.visualizationDate = visualizationDate;
        this.score = score;
        this.contentID = contentID;
    }

    //@Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getVisualizationDate() {
        return visualizationDate;
    }

    public void setVisualizationDate(LocalDate visualizationDate) {
        this.visualizationDate = visualizationDate;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public long getContentID() {
        return contentID;
    }

    public void setContentID(long contentID) {
        this.contentID = contentID;
    }


    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("Title: %s\nVisualization Date: %s\nScore: %s\nID: %s",
                getName(),
                getVisualizationDate(),
                getScore(),
                getContentID());
    }

}
