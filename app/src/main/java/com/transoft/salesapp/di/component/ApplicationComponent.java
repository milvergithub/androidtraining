package com.transoft.salesapp.di.component;

import android.content.Context;

import com.transoft.salesapp.SalesApplication;
import com.transoft.salesapp.api.PickUpService;
import com.transoft.salesapp.di.module.ContextModule;
import com.transoft.salesapp.di.module.RetrofitModule;
import com.transoft.salesapp.di.qualifier.ApplicationContext;
import com.transoft.salesapp.di.scopes.ApplicationScope;

import dagger.Component;

@ApplicationScope
@Component(modules = {ContextModule.class, RetrofitModule.class})
public interface ApplicationComponent {

    PickUpService getPickUpService();

    @ApplicationContext
    Context getContext();

    void injectApplication(SalesApplication salesApplication);
}
