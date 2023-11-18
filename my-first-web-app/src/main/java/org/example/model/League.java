package org.example.model;

public class League {

    private String leagueTitle;
    private String season;
    private int year;

    public League() {
    }

    public League(String leagueTitle, String season, int year) {
        this.leagueTitle = leagueTitle;
        this.season = season;
        this.year = year;
    }

    public String getLeagueTitle() {
        return leagueTitle;
    }

    public void setLeagueTitle(String leagueTitle) {
        this.leagueTitle = leagueTitle;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return
                "League Title='" + leagueTitle + '\'' +
                ", season='" + season + '\'' +
                ", year=" + year;
    }
}
