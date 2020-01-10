package com.tetfudev.sports268.ui.premierleague.fixture;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FixtureViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FixtureViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is fixture fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}