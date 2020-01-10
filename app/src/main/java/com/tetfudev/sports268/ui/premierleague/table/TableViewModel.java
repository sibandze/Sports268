package com.tetfudev.sports268.ui.premierleague.table;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TableViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TableViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Mbabane Highlanders");
    }

    public LiveData<String> getText() {
        return mText;
    }
}