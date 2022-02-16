package company.stream.forremove;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import company.basic.stream.foreach.price2.ItemFactory;
import company.basic.stream.foreach.price2.item.Item;
import company.basic.stream.foreach.price2.item.Items;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ItemFactoryTest {

    @Test
    void Itemが12個1セット作成できていること() {
        Items result = ItemFactory.oneSet();
        assertEquals(12, result.size());
    }

    @Test
    void セットを12万個作成() {
        List<Items> result = Stream.generate(ItemFactory::oneSet).limit(10000).collect(Collectors.toList());
        assertAll(
                () -> assertEquals(10000, result.size()),
                () -> assertEquals(0, result.stream()
                        .filter(items -> items.asList()
                                .stream()
                                .anyMatch(item -> item.price().value() <= 0))
                        .count())
        );
    }

    @Test
    void アイテムを削除できること() {
        Items oneSet = ItemFactory.oneSet();
        Item removeTarget = oneSet.asList().get(0);
        Item exist = oneSet.asList().get(1);
        Items removed = oneSet.remove(removeTarget.itemNumber());
        assertAll(
                () -> assertEquals(oneSet.size(), removed.size() + 1),
                () -> assertFalse(removed.asList().contains(removeTarget)),
                () -> assertTrue(removed.asList().contains(exist))
        );
    }
}
