package company.stream.forremove.item;

import java.util.Objects;

public class Price {
    int value;

    public Price(int price) {
        if (!validValue(price)) throw new IllegalArgumentException("The price ranges from 0 to 10000.");
        this.value = price;
    }

    public int value() {
        return value;
    }

    public static boolean validValue(int input) {
        if (Objects.isNull(input)) return false;
        return 0 < input && input < 10000;
    }
}
