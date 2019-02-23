package com.notixia.whh.mytestapplication.mvp_injection;

import com.notixia.whh.mytestapplication.activities.SayHelloActivity;

import dagger.Component;

@Component(modules = SayHelloPresenterModule.class)
public interface SayHelloComponent {

    void inject(SayHelloActivity sayHelloActivity);
}
