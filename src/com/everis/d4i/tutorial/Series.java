package com.everis.d4i.tutorial;

import java.util.Date;

public class Series extends Content
{
    private String _studio;
    private int _seasons;
    private int _firstSeasonYear;
    private double[] _seasonScore;

    public Series()
    {

    }

    public Series(String name, Date visualizationDate, double score, long contentID,
                  String studio, int seasons, int firstSeasonYear, double[] seasonScore)
    {
        super(name, visualizationDate, score, contentID);
        _studio = studio;
        _seasons = seasons;
        _seasonScore = seasonScore;
        _firstSeasonYear = firstSeasonYear;

    }

    //Getters & Setters
    public String getStudio(){return _studio; }
    public void setStudio(String studio){ _studio = studio; }

    public int getSeasons(){ return _seasons; }
    public void setSeasons(int seasons){ _seasons = seasons; }

    public int getFirstSeasonYear(){ return _firstSeasonYear; }
    public void setFirstSeasonYear(int firstSeasonYear){ _firstSeasonYear = firstSeasonYear; }

    public double[] getSeasonScore(){ return _seasonScore; }
    public double getSpecificSeasonScore(int index) { return _seasonScore[index]; }
    public void setSeasonScore(double score, int i) { _seasonScore[i] = score; }

    public double getAverageScore()
    {
        double score = 0;
        int count = 0;
        for(double sc : _seasonScore)
        {
            if(score != -1)
            {
                score +=sc;
                count++;
            }
        }
        return score/count;
    }


    public String toString()
    {
        return String.format("%s\nStudio: %s\nSeasons: %s\nYear of First Season: %s\n%s",
                super.toString(),
                getStudio(),
                getSeasons(),
                getFirstSeasonYear(),
                printSeasonScore());
    }

    public String printSeasonScore()
    {
        String str = "";
        for(int i = 0; i<_seasonScore.length; i++)
        {
            if(_seasonScore[i] != -1)
            {
                str += String.format("Season %s score: %s.\n",
                        i+1,
                        _seasonScore[i]);
            } else {
                str += "Season "+ (i+1) + " is pending of score.\n";
            }
        }
        return str;
    }

}
