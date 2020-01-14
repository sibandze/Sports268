package com.tetfudev.sports268.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Team {

    @SerializedName("id")
    private int id;
    @SerializedName("team_name")
    private String teamName;
    @SerializedName("logo")
    private String teamLogoUrl;
    @SerializedName("P")
    private int P;
    @SerializedName("W")
    private int W;
    @SerializedName("D")
    private int D;
    @SerializedName("L")
    private int L;
    @SerializedName("GF")
    private int GF;
    @SerializedName("GA")
    private int GA;
    private int GD;
    private int PTS;


}