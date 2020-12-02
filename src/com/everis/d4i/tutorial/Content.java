package com.everis.d4i.tutorial;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Content
{
    private String _name;
    private Date _visualizationDate;
    private double _score;
    private long _contentID;

    public Content()
    {

    }

    public Content(String name, Date visualizationDate, double score, long contentID)
    {
        _name = name;
        _visualizationDate = visualizationDate;
        _score = score;
        _contentID = contentID;
    }

    //@Getters & Setters
    public String getName() { return _name; }
    public void setName(String name){ _name = name; }

    public Date getVisualizationDate() { return _visualizationDate; }
    public void setVisualizationDate(Date visualizationDate){ _visualizationDate = visualizationDate; }

    public double getScore() { return _score; }
    public void setScore(double score) { _score = score; }

    public long getContentID() { return _contentID; }
    public void setContentID(long contentID) { _contentID = contentID; }


    public String toString()
    {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("Title: %s\nVisualization Date: %s\nScore: %s\nID: %s",
                getName(),
                formatter.format(getVisualizationDate()),
                getScore(),
                getContentID());
    }

}
