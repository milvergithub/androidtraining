package com.transoft.salesapp.mvp;

import com.transoft.salesapp.model.PickUp;

import java.util.List;

public interface MainActivityContract {
    interface View {
        void showData(List<PickUp> pickUps);
        void showError(String message);
        void showComplete();
        void showProgress();
        void hideProgress();
    }

    interface Presenter {
        void loadData();
    }
}
