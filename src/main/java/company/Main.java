package company;

import company.interfaces.Context;
import company.serial.SerialAnimalContext;

public class Main {

    public static void main(String[] args) {
        Context context = new SerialAnimalContext();
        context.go();
    }
}
