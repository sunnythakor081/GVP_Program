package Factory_method.Vehicle_Factory;

public class VehicleFactory {

    // Factory Method
    public static Vehicle getVehicle(String type) {

        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("bike")) {
            return new Bike();
        } else {
            throw new IllegalArgumentException("Invalid vehicle type");
        }
    }
}

