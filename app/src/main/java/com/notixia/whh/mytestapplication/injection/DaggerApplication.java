package com.notixia.whh.mytestapplication.injection;

import android.app.Application;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

/**
 * Created by whh on 18-06-28.
 */

public class DaggerApplication extends Application {
    private static DaggerGraphComponent graph;
    private static DaggerApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        Fabric.with(this, new Crashlytics());
        instance = this;
        buildComponentGraph();
    }

    public static DaggerGraphComponent component() {
        return graph;
    }

    public static void buildComponentGraph() {
        graph = DaggerGraphComponent.Initializer.init(instance);
    }
}
