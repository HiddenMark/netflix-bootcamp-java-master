package com.everis.d4i.tutorial;

public class Seasons {

    private int numSeason;
    private double score;

    public Seasons() {

    }

    public Seasons(int numSeason, int score) {
        this.numSeason = numSeason;
        this.score = score;
    }

    public int getNumSeason() {
        return numSeason;
    }

    public void setNumSeason(int numSeason) {
        this.numSeason = numSeason;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
