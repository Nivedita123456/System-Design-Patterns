package designpatterns.creational.abstractFactory;

public class BrandFactory {
    public static AbstractVehicleFactory getBrandInstance(String brand){
        if(brand.equals("Maruti")){
            return new MarutiFactory();
        }
        return new HyundaiFactory();
    }

}
