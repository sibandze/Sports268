package com.tetfudev.sports268.model.PremierLeague;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamLogoUrl() {
        return teamLogoUrl;
    }

    public void setTeamLogoUrl(String teamLogoUrl) {
        this.teamLogoUrl = teamLogoUrl;
    }

    public int getP() {
        return P;
    }

    public void setP(int p) {
        P = p;
    }

    public int getW() {
        return W;
    }

    public void setW(int w) {
        W = w;
    }

    public int getD() {
        return D;
    }

    public void setD(int d) {
        D = d;
    }

    public int getL() {
        return L;
    }

    public void setL(int l) {
        L = l;
    }

    public int getGF() {
        return GF;
    }

    public void setGF(int GF) {
        this.GF = GF;
    }

    public int getGA() {
        return GA;
    }

    public void setGA(int GA) {
        this.GA = GA;
    }

    public int getGD() {
        return GF - GA;
    }



    public int getPTS() {
        return 3 * W + 1 * D + 0 * L;
    }

}