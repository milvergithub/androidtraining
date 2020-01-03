package com.transoft.salesapp.activity.SppActivity.reception;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ReceptionViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ReceptionViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Reception fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
