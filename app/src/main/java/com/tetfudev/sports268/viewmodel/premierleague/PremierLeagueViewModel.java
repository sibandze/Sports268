package com.tetfudev.sports268.viewmodel.premierleague;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.tetfudev.sports268.model.PremierLeague.PremierLeagueRepository;
import com.tetfudev.sports268.model.PremierLeague.Team;

import java.util.List;

public class PremierLeagueViewModel extends AndroidViewModel {
    private PremierLeagueRepository premierLeagueRepository;
    public PremierLeagueViewModel(@NonNull Application application) {
        super(application);
        premierLeagueRepository = new PremierLeagueRepository(application);
    }
    public LiveData<List<Team>> getLeagueTable() {
        return premierLeagueRepository.getMutableLiveData();
    }
}
