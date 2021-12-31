package company.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class AnimalSerialMachine {
    private static final String serialFileName = "./serial.ser";

    static void make(Object serializeAnimal) {
        if (!(serializeAnimal instanceof Animal)) throw new IllegalArgumentException("Only Animal Class");
        try (ObjectOutput outStream = new ObjectOutputStream(new FileOutputStream(serialFileName))) {
            outStream.writeObject(serializeAnimal);
            outStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static Animal read() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(serialFileName))) {
            return (Animal) inputStream.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException("Not found De-Serialize Targets");
    }
}
