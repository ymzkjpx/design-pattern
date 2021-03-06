package company.basic.stream.foreach.price2.item;

import java.util.UUID;

public class ItemNumber {
    UUID value;

    private ItemNumber(UUID value) {
        this.value = value;
    }

    public UUID value() {
        return value;
    }

    public static ItemNumber generate() {
        return new ItemNumber(UUID.randomUUID());
    }
}
