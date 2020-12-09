package com.everis.d4i.tutorial;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Series extends Content {
    private String studio;
    private int seasons;
    private int firstSeasonYear;
    private List<Seasons> seasonScore;

    public Series() {

    }

    public Series(String name, LocalDate visualizationDate, double score, long contentID,
                  String studio, int seasons, int firstSeasonYear, List<Seasons> seasonScore) {
        super(name, visualizationDate, score, contentID);
        this.studio = studio;
        this.seasons = seasons;
        this.seasonScore = seasonScore;
        this.firstSeasonYear = firstSeasonYear;

    }

    //Getters & Setters
    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getFirstSeasonYear() {
        return firstSeasonYear;
    }

    public void setFirstSeasonYear(int firstSeasonYear) {
        this.firstSeasonYear = firstSeasonYear;
    }

    public List<Seasons> getSeasonScore() {
        return seasonScore;
    }

    public double getSpecificSeasonScore(int index) {
        return seasonScore.get(index).getScore();
    }

    public void setSeasonScore(double score, int i) {
        seasonScore.get(i).setScore(score);
    }


    public String toString() {
        return String.format("%s\nStudio: %s\nSeasons: %s\nYear of First Season: %s\n%s",
                super.toString(),
                getStudio(),
                getSeasons(),
                getFirstSeasonYear(),
                printSeasonScore());
    }

    public String printSeasonScore() {
        String str = "";
        for (int i = 0; i < seasonScore.size(); i++) {
            if (seasonScore.get(i).getScore() != -1) {
                str += String.format("Season %s score: %s.\n",
                        i + 1,
                        seasonScore.get(i).getScore());
            } else {
                str += "Season " + (i + 1) + " is pending of score.\n";
            }
        }
        return str;
    }

}
