package company.stream.forremove;

import org.junit.jupiter.api.Test;

import company.stream.forremove.item.Items;

import static org.junit.jupiter.api.Assertions.*;

class ItemFactoryTest {

    @Test
    void Itemが12個1セット作成できていること(){
        Items result = ItemFactory.oneSet();
        assertEquals(12, result.asList().size());
    }
}