package com.tetfudev.sports268.service.PremierLeague;

import com.tetfudev.sports268.model.PremierLeague.ServerDataWrapper;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApiService {
    @GET("fakedata")
    Call<ServerDataWrapper> getLeagueData();
}
