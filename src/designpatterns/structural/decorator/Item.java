package designpatterns.structural.decorator;

public abstract class Item {
    int cost;
    public Item(int cost){
        this.cost =cost;
    }
    public abstract int getCostProduct();
}