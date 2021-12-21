package company;

import company.interfaces.Context;
import company.stream.foreach.ForEachContext;

public class Main {

    public static void main(String[] args) {
        Context context = new ForEachContext();
        context.go();
    }
}
