package com.notixia.whh.mytestapplication.injection2;

import com.notixia.whh.mytestapplication.activities.Test2Activity;
import com.notixia.whh.mytestapplication.injection2.dependencies.BackEndServiceModule;
import com.notixia.whh.mytestapplication.injection2.dependencies.UserModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = { UserModule.class, BackEndServiceModule.class })
public interface Test2Component {

    // provide the dependency for dependent components
    // (not needed for single-component setups)
    BackendService provideBackendService();

    // allow to inject into our Main class
    // method name not important
    void inject(Main main);
}
