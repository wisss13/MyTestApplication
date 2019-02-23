package com.notixia.whh.mytestapplication.injection2;

import javax.inject.Inject;

public class Main {

    @Inject
    BackendService backendService; //

    private Test2Component component;

    private Main() {
        component = DaggerTest2Component.builder().build();
        component.inject(this);
    }

    private void callServer() {
        boolean callServer = backendService.callServer();
        if (callServer) {
            System.out.println("Server call was successful. ");
        } else {
            System.out.println("Server call failed. ");
        }
    }

    public static void main(String[] args) {
        Main activity = new Main();
        activity.callServer();
    }
}
