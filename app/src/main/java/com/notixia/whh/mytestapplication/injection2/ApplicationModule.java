package com.notixia.whh.mytestapplication.injection2;

import com.notixia.whh.mytestapplication.activities.MainActivity;
import com.notixia.whh.mytestapplication.activities.Test2Activity;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ApplicationModule {
    @ContributesAndroidInjector
    abstract Test2Activity contributeActivityInjector();
}
