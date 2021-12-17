package com.company.pattern.nullobject.path;

public class NonExistPath implements EchoPath {

    @Override
    public String echo() {
        return "Path is not exist.";
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
