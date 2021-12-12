package com.company;

import com.company.interfaces.Context;
import com.company.nullobjectpattern.path.EchoPathContext;

public class Main {

    public static void main(String[] args) {
        Context context = new EchoPathContext();
        context.go();
    }
}
