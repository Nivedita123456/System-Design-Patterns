package designpatterns.structural.proxy;

public class RealImage implements IImage{
    RealImage(){
        System.out.println("Loading Image");
    }

    @Override
    public void displayImage() {
        System.out.println("Called Real Image");
    }
}
