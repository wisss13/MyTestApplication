package com.notixia.whh.mytestapplication.injection2;

import javax.inject.Inject;
import javax.inject.Named;

public class BackendService {

    @Inject
    public User user;

    private String serverUrl;

    @Inject
    public BackendService(@Named("serverUrl") String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public boolean callServer() {
        if (user !=null && serverUrl!=null && serverUrl.length()>0) {
            System.out.println("User: " + user + " ServerUrl: "  + serverUrl);
            return true;
        }
        return false;
    }
}

