package company.stream.foreach.price2.item;

import java.util.ArrayList;
import java.util.List;

public class Items {
    List<Item> list;

    public Items(List<Item> list) {
        this.list = list;
    }

    public static Items from(List<Item> list) {
        return new Items(list);
    }

    public List<Item> asList() {
        return list;
    }

    public int size() {
        return list.size();
    }

    public Items remove(ItemNumber numberToRemove) {
        List<Item> result = new ArrayList<>(list);
        result.removeIf(item -> item.equalItem(numberToRemove));
        return new Items(result);
    }
}
