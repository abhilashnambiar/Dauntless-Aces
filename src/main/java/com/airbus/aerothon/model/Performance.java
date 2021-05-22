package com.airbus.aerothon.model;

public class Performance {

    private Double rating = 4.5;
    private Double timeSpent = 2.7;
    private Integer bugsResolved = 25;

    public Performance() {
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Double getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(Double timeSpent) {
        this.timeSpent = timeSpent;
    }

    public Integer getBugsResolved() {
        return bugsResolved;
    }

    public void setBugsResolved(Integer bugsResolved) {
        this.bugsResolved = bugsResolved;
    }
}
