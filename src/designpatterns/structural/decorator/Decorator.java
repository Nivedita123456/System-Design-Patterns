package designpatterns.structural.decorator;

public abstract class Decorator extends Item{
    Item item;
     Decorator(int cost,Item item){
         super(cost);
        this.item= item;
    }
    public abstract int getCostProduct();
}
