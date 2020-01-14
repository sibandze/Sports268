package com.tetfudev.sports268.model.PremierLeague;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;

import com.tetfudev.sports268.service.PremierLeague.RestApiService;
import com.tetfudev.sports268.service.PremierLeague.RetrofitInstance;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PremierLeagueRepository {
    private ArrayList<Team> teams = new ArrayList<>();
    private League league = new League();
    private MutableLiveData<List<Team>> mutableLiveData = new MutableLiveData<>();
    private Application application;

    public PremierLeagueRepository(Application application) {
        this.application = application;
    }

    public MutableLiveData<List<Team>> getMutableLiveData() {
        RestApiService apiService = RetrofitInstance.getApiService();
        Call<ServerDataWrapper> call = apiService.getLeagueData();
        call.enqueue(new Callback<ServerDataWrapper>() {
            @Override
            public void onResponse(Call<ServerDataWrapper> call, Response<ServerDataWrapper> response) {
                if(response.body()==null){
                    Toast.makeText(application.getBaseContext(), "Still null", Toast.LENGTH_SHORT).show();
                    return;
                }
                ServerDataWrapper mServerDataWrapper = response.body();
                Log.d("Repository.onResponse",response.body().toString());
                if (mServerDataWrapper != null && mServerDataWrapper.getmTeams() != null) {
                    League league = mServerDataWrapper.getmTeams();
                    teams = (ArrayList<Team>) league.getmTeams();
                    mutableLiveData.setValue(teams);
                    Log.d("Repository.onResponse", "Success" + teams.size());
                }
            }
            @Override
            public void onFailure(Call<ServerDataWrapper> call, Throwable t) {
                Log.d("Repository.onFailure", "Fail");
            }
        });
        return mutableLiveData;
    }


    String getSeason(){
        return league.getSeason();
    }

}
