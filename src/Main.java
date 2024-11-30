import designpatterns.behavioural.chainresponsibility.DebugLoggingLevel;
import designpatterns.behavioural.chainresponsibility.ErrorLoggingLevel;
import designpatterns.behavioural.chainresponsibility.InfoLoggingLevel;
import designpatterns.behavioural.chainresponsibility.LoggingLevel;
import designpatterns.behavioural.command.Invoker;
import designpatterns.behavioural.command.Reciever;
import designpatterns.behavioural.command.TypeCommand;
import designpatterns.behavioural.observer.*;
import designpatterns.behavioural.strategy.Context;
import designpatterns.behavioural.strategy.IStrategy.BubbleSortStrategy;
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

import java.sql.Array;
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

        /*Builder Design Pattern*/
//        Vehicle1 vehicle = new Vehicle1.VehicleBuilder().setVehicleNumber("").setCost(1).build();
//        Vehicle1 vehicle1 = new Vehicle1.VehicleBuilder().build();
//        System.out.println(vehicle.getCost());
//        System.out.println(vehicle1.getCost());
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
        /*Command Design Pattern
        Invoker invoker = new Invoker(new TypeCommand(new Reciever()));
        invoker.invoke();
        */
        /*Chain Responsibility Pattern
        LoggingLevel loggingLevel = new InfoLoggingLevel(new DebugLoggingLevel(new ErrorLoggingLevel(null)));
        loggingLevel.logging("DEBUG", "Debugging Message");
        */
        /*Strategy Design Pattern
        ArrayList<Integer> arrayList = new ArrayList<>();
        Context obj = new Context(new BubbleSortStrategy(), arrayList);
        obj.sort();
        */
        /*Observer Design Pattern
        List<Observer> observers= new ArrayList<>();
        observers.add(new Observer("b1@gmail.com", 1));
        observers.add(new Observer("b2@gmail.com", 1));
        observers.add(new Observer("b2@gmail.com", 2));
        IObservable observable = new ItemObservable(observers);
        List<Item> reStockList = new ArrayList<>();
        reStockList.add(new Bag(1, 2, 20));
        observable.reStock(reStockList);
         */
    }
}