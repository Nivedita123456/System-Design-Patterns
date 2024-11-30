package designpatterns.behavioural.observer;

public class Bag extends Item{

    public Bag(int itemId, int qty, int price) {
        super(itemId, qty, price);
    }

    @Override
    void addQuantity(int addedQty) {
        this.qty += addedQty;
    }
}
