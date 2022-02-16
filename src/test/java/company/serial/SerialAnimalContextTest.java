package company.serial;

import org.junit.jupiter.api.Test;

import company.basic.serial.Animal;
import company.basic.serial.AnimalSerialMachine;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class SerialAnimalContextTest {
    @Test
    void シリアライズできること(){
        Animal animal = new Animal(10, "Leo", "れおくん");
        AnimalSerialMachine.make(animal);
        Animal result = AnimalSerialMachine.read();
        assertAll(
                ()->assertEquals(animal.age(), result.age()),
                ()->assertEquals(animal.name(), result.name()),
                ()->assertEquals(animal.nickname(), result.nickname()),
                ()->assertNotNull(result)
        );
    }

    @Test
    void 同種インスタンスを2つ以上保存すると上書きされる(){
        Animal animal = new Animal(10, "Lion", "れおくん");
        Animal animal2 = new Animal(12, "Hippo", "かばおくん");
        AnimalSerialMachine.make(animal);
        AnimalSerialMachine.make(animal2);
        Animal result = AnimalSerialMachine.read();
        assertAll(
                ()->assertNotEquals(animal.age(), result.age()),
                ()->assertNotEquals(animal.name(), result.name()),
                ()->assertNotEquals(animal.nickname(), result.nickname()),
                ()->assertEquals(animal2.age(), result.age()),
                ()->assertEquals(animal2.name(), result.name()),
                ()->assertEquals(animal2.nickname(), result.nickname()),
                ()->assertNotNull(result)
        );
    }

}
