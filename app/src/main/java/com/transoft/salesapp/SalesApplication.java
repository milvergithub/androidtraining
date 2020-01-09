package com.transoft.salesapp;

import android.app.Activity;
import android.app.Application;

import com.transoft.salesapp.di.component.ApplicationComponent;
import com.transoft.salesapp.di.component.DaggerApplicationComponent;
import com.transoft.salesapp.di.module.ContextModule;

public class SalesApplication extends Application {

    ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder().contextModule(new ContextModule(this)).build();
        applicationComponent.injectApplication(this);
    }

    public static SalesApplication get(Activity activity){
        return (SalesApplication) activity.getApplication();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
