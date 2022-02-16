package company.basic.stream.foreach.price2;

import company.interfaces.Context;
import company.basic.stream.foreach.price2.item.Item;
import company.basic.stream.foreach.price2.item.Items;

public class Price2Context implements Context {
    @Override
    public void go() {
        Items items = ItemFactory.oneSet();
        Item removeTarget = find2nd(items);
        Items removed = items.remove(removeTarget.itemNumber());
        System.out.println(items);
        assert equals(items.size() == removed.size() + 1);
    }

    private Item find2nd(Items items) {
        return items.asList().get(1);
    }
}
