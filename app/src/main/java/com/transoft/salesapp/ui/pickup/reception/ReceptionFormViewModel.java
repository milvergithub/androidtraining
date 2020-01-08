package com.transoft.salesapp.ui.pickup.reception;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ReceptionFormViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ReceptionFormViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}
