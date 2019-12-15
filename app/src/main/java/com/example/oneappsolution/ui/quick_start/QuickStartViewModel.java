package com.example.oneappsolution.ui.quick_start;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class QuickStartViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public QuickStartViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Qucik Start fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}