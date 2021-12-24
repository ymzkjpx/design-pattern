package company.stream.forremove.item;

import java.util.Objects;

public class Price {
    int value;

    public Price(int value) {
        if (!valid(value)) throw new IllegalArgumentException("The price ranges from 0 to 10000.");
        this.value = value;
    }

    public int value() {
        return value;
    }

    public static boolean valid(int input) {
        if (Objects.isNull(input)) return false;
        if (0 >= input || input <= 10000) return false;
        return true;
    }
}
