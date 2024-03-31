package designpatterns.structural.proxy;


public class ProxyImage implements IImage{
    IImage image;
    @Override
    public void displayImage() {
        System.out.println("Called Proxy Image");
        if(image == null){
            image = new RealImage();
        }
        image.displayImage();;
    }
}
