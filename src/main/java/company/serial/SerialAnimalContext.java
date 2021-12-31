package company.serial;

import company.interfaces.Context;

public class SerialAnimalContext implements Context {

    @Override
    public void go() {
        assemble();
    }

    private void assemble() {
        Animal animal1 = new Animal(10, "Lion", "レオ");
        AnimalSerialMachine.make(animal1);
        System.out.println(animal1); //-> Animal{age=10, name='Lion', nickname='レオ'}
        Animal result = AnimalSerialMachine.read();
        System.out.println(result); //-> Animal{age=10, name='Lion', nickname='null'}
    }
}
