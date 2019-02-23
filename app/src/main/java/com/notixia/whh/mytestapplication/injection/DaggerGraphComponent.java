package com.notixia.whh.mytestapplication.injection;

import com.notixia.whh.mytestapplication.activities.DependencyInjectionTestActivity;
import com.notixia.whh.mytestapplication.activities.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by whh on 18-06-28.
 */

@Singleton
@Component(modules = {MainModule.class})
public interface DaggerGraphComponent {

    void inject(DependencyInjectionTestActivity dependencyInjectionActivity);

    static final class Initializer {
        private Initializer() {
        }

        public static DaggerGraphComponent init(DaggerApplication app) {
            return DaggerDaggerGraphComponent.builder()
                    .mainModule(new MainModule(app))
                    .build();
        }
    }
}
