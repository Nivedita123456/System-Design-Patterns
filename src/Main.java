import designpatterns.creational.Builder.Vehicle1;
import designpatterns.creational.abstractFactory.AbstractVehicleFactory;
import designpatterns.creational.abstractFactory.BrandFactory;
import designpatterns.creational.abstractFactory.Vehicle;
import designpatterns.creational.factory.AbstractShape;
import designpatterns.creational.factory.FactoryDesignPattern;
import designpatterns.structural.adapter.Adaptee;
import designpatterns.structural.adapter.Adapter;
import designpatterns.structural.adapter.IAdapter;
import designpatterns.structural.bridge.Box;
import designpatterns.structural.bridge.IView;
import designpatterns.structural.bridge.SingleView;
import designpatterns.structural.composite.INode;
import designpatterns.structural.composite.LeafNode;
import designpatterns.structural.composite.NonLeafNode;
import designpatterns.structural.decorator.Cheese;
import designpatterns.structural.decorator.Decorator;
import designpatterns.structural.decorator.Overloaded;
import designpatterns.structural.decorator.Pizza;
import designpatterns.structural.proxy.IImage;
import designpatterns.structural.proxy.ProxyImage;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       /*Factory design Pattern Client Class
        AbstractShape shape = FactoryDesignPattern.createShapeInstance("Circle");
        shape.drawShape();
        */
        /*Abstract Factory Design Pattern
        AbstractVehicleFactory vehicleFactory = BrandFactory.getBrandInstance("Maruti");
        Vehicle vehicle = vehicleFactory.getVehicle("Bike");
        vehicle.drive();
         */
        /*Builder Design Pattern
        Vehicle1 vehicle = new designpatterns.creational.Builder.Vehicle1.VehicleBuilder().setVehicleNumber("").setCost(1).build();
        System.out.println(vehicle.getCost());
         */
        /*Adapter Design Pattern
        IAdapter iAdapter = new Adapter(new Adaptee());
        iAdapter.request();
         */
        /*Bridge Pattern
        IView view = new SingleView(new Box());
        view.displayOnScreen();
         */
        /*Composite Design Pattern
        ArrayList<INode> listNodes = new ArrayList<>();
        listNodes.add(new LeafNode(2));
        listNodes.add(new LeafNode(3));
        INode root = new NonLeafNode(1, listNodes);
        System.out.println(root.getVal());
         */
        /*Decorator Design Pattern
        Decorator pizza = new Cheese(100, new Overloaded(150, new Pizza(10)));
        System.out.println(pizza.getCostProduct());
         */
        /*Proxy Design Pattern
        IImage image = new ProxyImage();
        image.displayImage();
        image.displayImage();
         */
    }
}