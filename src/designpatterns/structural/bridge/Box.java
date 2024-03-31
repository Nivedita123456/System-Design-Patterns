package designpatterns.structural.bridge;

public class Box implements IWidget{
    @Override
    public String getType() {
        return "Box";
    }
}
