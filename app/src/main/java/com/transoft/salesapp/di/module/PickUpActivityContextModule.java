package com.transoft.salesapp.di.module;

import android.content.Context;
import com.transoft.salesapp.di.qualifier.ActivityContext;
import com.transoft.salesapp.di.scopes.ActivityScope;
import com.transoft.salesapp.ui.spp.PickUpListActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class PickUpActivityContextModule {

    private PickUpListActivity pickUpListActivity;

    public Context context;

    public PickUpActivityContextModule(PickUpListActivity pickUpListActivity) {
        this.pickUpListActivity = pickUpListActivity;
        context = pickUpListActivity;
    }

    @Provides
    @ActivityScope
    public PickUpListActivity providesPickUpListActivity() {
        return pickUpListActivity;
    }

    @Provides
    @ActivityScope
    @ActivityContext
    public Context provideContext() {
        return context;
    }
}
