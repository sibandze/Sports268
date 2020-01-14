package com.tetfudev.sports268.model;

import android.util.Pair;

class Game {
    private int gameId;
    public boolean isPlayed;
    private GameResult gameResult;
    private Team homeTeam;
    private Team awayTeam;
    private Pair<Integer, Integer> gameScore;

    public Game(int gameId, Team homeTeam, Team awayTeam, Pair<Integer, Integer> gameScore) {
        this.gameId = gameId;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.gameScore = gameScore;

        isPlayed();
    }

    public Game(GameResult gameResult, Team homeTeam, Team awayTeam, Pair<Integer, Integer> gameScore) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.gameScore = gameScore;

        isPlayed();
    }

    private void isPlayed() {
        if(gameScore.first != null){
            isPlayed = true;
            setGameResult();
        }
        else {
            isPlayed = false;
        }
    }

    private void setGameResult() {
        if(isPlayed){
            if(gameScore.first > gameScore.second){
                gameResult = GameResult.HomeTeamWin;
            }
            else if(gameScore.first < gameScore.second){
                gameResult = GameResult.AwayTeamWin;
            }
            else {
                gameResult = GameResult.Draw;
            }
        }
    }

    public enum GameResult{
        HomeTeamWin,
        AwayTeamWin,
        Draw
    }

    public int getGoalsFor(Team team){
        if(isHomeTeam(team)){
           return gameScore.first;
        }
        else {
            return gameScore.second;
        }
    }
    public int getGoalsAgainst(Team team){
        if(isHomeTeam(team)){
            return gameScore.second;
        }
        else {
            return gameScore.first;
        }
    }

    public boolean isHomeTeam(Team team) {
        return homeTeam.equals(team);
    }
    public boolean isAwayTeam(Team team){
        return awayTeam.equals(team);
    }

    public GameResult getGameResult() {
        return gameResult;
    }

    public Pair<Integer, Integer> getGameScore() {
        return gameScore;
    }
}
