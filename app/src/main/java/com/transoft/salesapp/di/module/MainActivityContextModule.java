package com.transoft.salesapp.di.module;

import android.content.Context;

import com.transoft.salesapp.di.qualifier.ActivityContext;
import com.transoft.salesapp.di.scopes.ActivityScope;
import com.transoft.salesapp.ui.MainActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityContextModule {

    private MainActivity mainActivity;

    public Context context;

    public MainActivityContextModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        context = mainActivity;
    }

    @Provides
    @ActivityScope
    public MainActivity providesMainActivity() {
        return mainActivity;
    }

    @Provides
    @ActivityScope
    @ActivityContext
    public Context provideContext() {
        return context;
    }
}
