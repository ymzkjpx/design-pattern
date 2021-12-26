package company.stream.foreach.price2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import company.stream.foreach.price2.item.Item;
import company.stream.foreach.price2.item.ItemName;
import company.stream.foreach.price2.item.Items;
import company.stream.foreach.price2.item.Price;

public class ItemFactory {
    public static Items oneSet() {
        List<Item> result = Stream
                .generate(ItemFactory::thisOne)
                .limit(12)
                .collect(Collectors.toList());
        return Items.from(result);
    }

    public static Item thisOne() {
        return Item.from(new ItemName("Apple"), generatePrice());
    }

    private static Price generatePrice() {
        int value = (int) Math.random() * 100 * 100;
        if (value == 0) return new Price(1);
        return new Price(value);
    }
}
