package com.tetfudev.sports268.model;

public class Team {

    private int id;
    private String teamName;
    private String teamLogoUrl;
    private int W;
    private int D;
    private int  L;
    private int  GF;
    private int  GA;
    private int  GD;
    private int  PTS;
    private String season;

    public Team(String teamName, String teamLogoUrl, String season, int w, int d, int l, int GF, int GA) {
        this.teamName = teamName;
        this.teamLogoUrl = teamLogoUrl;
        W = w;
        D = d;
        L = l;
        this.GF = GF;
        this.GA = GA;
        this.season = season;

        calculatePTS();
        calculateGD();
    }

    public void setId(int id) {
        this.id = id;
    }

    private void calculateGD() {
        GD = GF - GA;
    }

    private void calculatePTS() {
        PTS = 3 * W + 1 * D;
    }

    public int getId() {
        return id;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getTeamLogoUrl() {
        return teamLogoUrl;
    }

    public int getW() {
        return W;
    }

    public int getD() {
        return D;
    }

    public int getL() {
        return L;
    }

    public int getGF() {
        return GF;
    }

    public int getGA() {
        return GA;
    }

    public int getGD() {
        return GD;
    }

    public int getPTS() {
        return PTS;
    }
}
