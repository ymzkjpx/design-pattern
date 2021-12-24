package company.stream.forremove.item;

import java.util.List;

public class Items {
    List<Item> list;

    public Items(List<Item> list) {
        this.list = list;
    }

    public static Items from(List<Item> list){
        return new Items(list);
    }

    public List<Item> asList(){
        return list;
    }
}
