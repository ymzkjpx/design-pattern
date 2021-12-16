package com.company;

import com.company.interfaces.Context;
import com.company.stream.foreach.ForEachContext;

public class Main {

    public static void main(String[] args) {
        Context context = new ForEachContext();
        context.go();
    }
}
