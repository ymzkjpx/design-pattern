package com.company.nullobjectpattern.path;

import com.company.interfaces.Context;

public class EchoPathContext implements Context {
    @Override
    public void go() {
        String echoPath = EchoPathFactory.create("/path/to");
        System.out.println(echoPath);

        String nonExistPath = EchoPathFactory.create(null);
        System.out.println(nonExistPath);
    }
}
