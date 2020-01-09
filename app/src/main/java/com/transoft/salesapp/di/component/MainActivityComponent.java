package com.transoft.salesapp.di.component;


import android.content.Context;

import com.transoft.salesapp.di.module.AdapterModule;
import com.transoft.salesapp.di.module.MainActivityMvpModule;
import com.transoft.salesapp.di.qualifier.ActivityContext;
import com.transoft.salesapp.di.scopes.ActivityScope;
import com.transoft.salesapp.ui.MainActivity;

import dagger.Component;

@ActivityScope
@Component(modules = {AdapterModule.class, MainActivityMvpModule.class}, dependencies = ApplicationComponent.class)
public interface MainActivityComponent {

    @ActivityContext
    Context getContext();

    void injectMainActivity(MainActivity mainActivity);
}
