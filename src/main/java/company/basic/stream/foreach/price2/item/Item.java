package company.basic.stream.foreach.price2.item;

import java.util.Objects;

public class Item {
    ItemNumber itemNumber = ItemNumber.generate();
    ItemName itemName;
    Price price;

    private Item(ItemNumber itemNumber, ItemName itemName, Price price) {
        this.itemNumber = itemNumber;
        this.itemName = itemName;
        this.price = price;
    }

    public static Item from(ItemNumber itemNumber, ItemName itemName, Price price) {
        return new Item(itemNumber, itemName, price);
    }

    public static Item from(ItemName itemName, Price price) {
        return new Item(ItemNumber.generate(), itemName, price);
    }

    public ItemNumber itemNumber() {
        return itemNumber;
    }

    public ItemName itemName() {
        return itemName;
    }

    public Price price() {
        return price;
    }

    public boolean equalItem(ItemNumber other) {
        if (Objects.isNull(other)) return false;
        return this.itemNumber().value().equals(other.value());
    }
}
