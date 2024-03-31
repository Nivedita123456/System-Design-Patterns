package designpatterns.structural.decorator;

public class Pizza extends Item{

    public Pizza(int cost) {
        super(cost);
    }

    @Override
    public int getCostProduct() {
        return cost;
    }
}
