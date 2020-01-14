package com.tetfudev.sports268.model.PremierLeague;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ServerDataWrapper {
    @SerializedName("data")
    private League mTeams;

    public League getmTeams() {
        return mTeams;
    }

    public void setmTeams(League mTeams) {
        this.mTeams = mTeams;
    }
}
