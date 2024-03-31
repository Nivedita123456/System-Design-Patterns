package designpatterns.creational.factory;

public class FactoryDesignPattern {
    public static AbstractShape createShapeInstance(String shape){
        if(shape.equals("Circle")){
            return new Circle();
        }
        return new Rectangle();
    }
}
