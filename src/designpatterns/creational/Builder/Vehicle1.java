package designpatterns.creational.Builder;

public class Vehicle1 {
    String name;
    String type;
    int speed;
    int milage;
    int cost;
    String vehicleNumber;
    public Vehicle1(){
    }

    public Vehicle1(VehicleBuilder builder){
        name = builder.name;
        type = builder.type;
        cost = builder.cost;
        speed = builder.speed;
        milage = builder.milage;
        vehicleNumber = builder.vehicleNumber;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMilage() {
        return milage;
    }

    public int getCost() {
        return cost;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public static class VehicleBuilder{
        String name;
        String type;
        int speed;
        int milage;
        int cost;
        String vehicleNumber;
        public VehicleBuilder(){
            System.out.println("Constructor Called");
        }

        public VehicleBuilder setName(String nameParam){
            name = nameParam;
            return this;
        }
        public VehicleBuilder setType(String typeParam){
            type = typeParam;
            return this;
        }
        public VehicleBuilder setCost(int costParam){
            cost = costParam;
            return this;
        }
        public VehicleBuilder setSpeed(int speedParam){
            speed = speedParam ;
            return this;
        }
        public VehicleBuilder setMilage(int milageParam){
            milage = milageParam;
            return this;
        }
        public VehicleBuilder setVehicleNumber(String vehicleNumberParam){
            vehicleNumber = vehicleNumberParam;
            return this;
        }
        public Vehicle1 build(){
            return new Vehicle1(this);
        }

    }
}
