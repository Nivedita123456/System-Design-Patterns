package designpatterns.structural.decorator;

public class Cheese extends Decorator{
    public Cheese(int cost, Item item) {
        super(cost,item);
    }

    @Override
    public int getCostProduct() {
        return cost+item.getCostProduct();
    }
}
