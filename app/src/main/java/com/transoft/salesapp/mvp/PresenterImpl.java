package com.transoft.salesapp.mvp;

import com.transoft.salesapp.api.PickUpService;
import com.transoft.salesapp.model.PickUp;

import java.util.List;

import javax.inject.Inject;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class PresenterImpl implements MainActivityContract.Presenter {

    PickUpService pickUpService;
    MainActivityContract.View view;

    @Inject
    public PresenterImpl(PickUpService pickUpService, MainActivityContract.View view) {
        this.pickUpService = pickUpService;
        this.view = view;
    }
    @Override
    public void loadData() {
        view.showProgress();
        pickUpService.getPickUps("10").subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<PickUp>>() {
                    @Override
                    public void onCompleted() {
                        view.showComplete();
                        view.hideProgress();
                    }

                    @Override
                    public void onError(Throwable e) {
                        view.showError("Error ocurred");
                        view.hideProgress();
                    }

                    @Override
                    public void onNext(List<PickUp> pickUps) {
                        view.showData(pickUps);
                    }
                });
    }
}
