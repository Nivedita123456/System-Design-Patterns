package designpatterns.structural.decorator;

public class Overloaded extends Decorator{

    public Overloaded(int cost, Item item) {
        super(cost, item);
    }
    @Override
    public int getCostProduct() {
        return cost+item.getCostProduct();
    }
}
