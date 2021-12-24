package company.stream.forremove;

import java.util.Collections;
import java.util.Random;
import java.util.stream.IntStream;

import company.stream.forremove.item.Item;
import company.stream.forremove.item.ItemName;
import company.stream.forremove.item.Items;
import company.stream.forremove.item.Price;

public class ItemFactory {
    public static Items oneSet() {
        // List<item> に12個のアイテムをセットする

    }

    public static Item thisOne() {
        return Item.from(new ItemName("Apple"), new Price((int) (Math.random() * 100) * 100));
    }
}
