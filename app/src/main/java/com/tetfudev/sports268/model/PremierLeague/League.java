package com.tetfudev.sports268.model.PremierLeague;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class League {
    @SerializedName("PremierLeagueTeams")
    private List<Team> mTeams;
    @SerializedName("Season")
    private String season;
    public List<Team> getmTeams() {
        return mTeams;
    }

    public void setmTeams(List<Team> mTeams) {
        this.mTeams = mTeams;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
}
