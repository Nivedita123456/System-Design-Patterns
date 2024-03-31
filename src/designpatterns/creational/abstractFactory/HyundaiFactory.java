package designpatterns.creational.abstractFactory;

public class HyundaiFactory extends AbstractVehicleFactory {
    @Override
    public Vehicle getVehicle(String vehicleType) {
        if(vehicleType.equals("Bike")){
            return new HyundaiBike();
        }
        return new HyundaiCar();
    }
}
