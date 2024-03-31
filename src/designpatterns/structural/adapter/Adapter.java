package designpatterns.structural.adapter;

public class Adapter implements IAdapter{
    Adaptee adaptee;
    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public void request() {
        System.out.println("Called Request Adapter");
        adaptee.adapteeRequest();
    }
}
