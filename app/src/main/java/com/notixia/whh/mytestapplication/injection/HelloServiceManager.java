package com.notixia.whh.mytestapplication.injection;

/**
 * Created by whh on 18-06-28.
 */

public class HelloServiceManager implements HelloService {

    @Override
    public String greet(String userName) {
        return "Hello " + userName + "!";
    }
}