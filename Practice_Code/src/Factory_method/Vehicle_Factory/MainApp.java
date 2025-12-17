package Factory_method.Vehicle_Factory;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle type [car/bike]: ");
        String type = sc.next();

        Vehicle vehicle = VehicleFactory.getVehicle(type);
        vehicle.start();
    }
}
