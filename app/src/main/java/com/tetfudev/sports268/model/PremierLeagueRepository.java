package com.tetfudev.sports268.model;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class PremierLeagueRepository {
    private ArrayList<Team> teams = new ArrayList<>();
    private MutableLiveData<List<Team>> mutableLiveData = new MutableLiveData<>();
    private Application application;

    public PremierLeagueRepository(Application application) {
        this.application = application;
    }
}
