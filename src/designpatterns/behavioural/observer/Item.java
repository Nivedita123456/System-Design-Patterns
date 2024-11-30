package designpatterns.behavioural.observer;

public abstract class Item {
    int itemId;
    int qty;
    int price;
    Item(int itemId, int qty, int price) {
        this.qty = qty;
        this.price = price;
        this.itemId = itemId;
    }
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

     abstract void addQuantity(int addedQty);
}
