package designpatterns.structural.decorator;

public class Margharetta extends Item{
    Margharetta(int cost) {
        super(cost);
    }

    @Override
    public int getCostProduct() {
        return cost;
    }
}
