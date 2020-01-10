package com.tetfudev.sports268.ui.premierleague.players;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PlayersViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PlayersViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is players fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}