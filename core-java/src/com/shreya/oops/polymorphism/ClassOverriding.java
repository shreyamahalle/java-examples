package src.com.shreya.oops.polymorphism;

import src.com.shreya.oops.polymorphism.overriding.CarService;
import src.com.shreya.oops.polymorphism.overriding.VehicleService;

public class ClassOverriding {
    public static void main(String[] args) {
        VehicleService vehicleService = new VehicleService();
        vehicleService.move();
        //data hiding
        vehicleService = new CarService();
        vehicleService.move();
    }
}
