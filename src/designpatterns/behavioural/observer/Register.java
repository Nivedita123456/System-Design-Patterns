package designpatterns.behavioural.observer;

public class Register extends Item{

    public Register(int itemId, int qty, int price) {
        super(itemId, qty, price);
    }
    @Override
    void addQuantity(int addedQty) {
        this.qty += addedQty;
    }
}
