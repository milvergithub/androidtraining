package com.transoft.salesapp.di.module;

import android.content.Context;

import com.transoft.salesapp.di.qualifier.ApplicationContext;
import com.transoft.salesapp.di.scopes.ApplicationScope;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {

    private Context context;

    public ContextModule(Context context) {
        this.context = context;
    }

    @Provides
    @ApplicationScope
    @ApplicationContext
    public Context provideContext() {
        return context;
    }
}
