package designpatterns.creational.abstractFactory;

public class MarutiFactory extends AbstractVehicleFactory {
    @Override
    public Vehicle getVehicle(String vehicleType) {
        if(vehicleType.equals("Bike")){
            return new MarutiBike();
        }
        return new MarutiCar();
    }
}
