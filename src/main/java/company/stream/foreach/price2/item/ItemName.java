package company.stream.foreach.price2.item;

import java.util.Objects;

public class ItemName {
    String value;

    public ItemName(String value) {
        if (!valid(value)) throw new IllegalArgumentException("Item name is invalid");
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static boolean valid(String input) {
        if (Objects.isNull(input)) return false;
        if ("".equals(input)) return false;
        return !"　".equals(input);
    }
}
