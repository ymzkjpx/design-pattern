package company.stream.forremove;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import company.stream.forremove.item.Item;
import company.stream.forremove.item.ItemName;
import company.stream.forremove.item.Items;
import company.stream.forremove.item.Price;

public class ItemFactory {
    public static Items oneSet() {
        List<Item> result = Stream
                .generate(ItemFactory::thisOne)
                .limit(12)
                .collect(Collectors.toList());
        return Items.from(result);
    }

    public static Item thisOne() {
        return Item.from(new ItemName("Apple"), new Price((int) (Math.random() * 100) * 10));
    }
}
