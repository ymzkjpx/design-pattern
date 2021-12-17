package com.company.pattern.nullobject.path;

public class ExistPath implements EchoPath {

    private String path;

    public ExistPath(String path) {
        this.path = path;
    }

    @Override
    public String echo() {
        return "path: " + path;
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
