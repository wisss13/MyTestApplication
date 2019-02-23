package com.notixia.whh.mytestapplication.injection2.dependencies;

import com.notixia.whh.mytestapplication.injection2.User;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class UserModule {

    @Provides
    @Singleton
    User providesUser() {
        return new User("Lars", "Vogel");
    }
}