package company.stream.forremove.item;

public class Item {
    ItemNumber itemNumber = ItemNumber.generate();
    ItemName itemName;
    Price price;

    private Item(ItemNumber itemNumber, ItemName itemName, Price price) {
        this.itemNumber = itemNumber;
        this.itemName = itemName;
        this.price = price;
    }

    public static Item from(ItemNumber itemNumber, ItemName itemName, Price price){
        return new Item(itemNumber, itemName, price);
    }

    public static Item from(ItemName itemName, Price price){
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
}
