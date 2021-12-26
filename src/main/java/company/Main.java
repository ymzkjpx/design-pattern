package company;

import company.interfaces.Context;
import company.stream.foreach.price1.ForEachContext;

public class Main {

    public static void main(String[] args) {
        Context context = new ForEachContext();
        context.go();
    }
}
