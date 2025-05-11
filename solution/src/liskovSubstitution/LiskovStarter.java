package liskovSubstitution;

import liskovSubstitution.withLiskov.GBicycle;
import liskovSubstitution.withLiskov.GCar;
import liskovSubstitution.withLiskov.GMotorCycle;
import liskovSubstitution.withLiskov.GVehicle;

public class LiskovStarter {


    //here Bicycle is not a motorvehicle and it will throw a null pointer exception for engine which is breaking our Liskov Substitution principle
    //here Vehicle is dependent on Bicycle which shouldn't be the case, now what we'll do is create a more generic Vehicle class which will be
    //common to all the vehicles. Name - GVehicle and now make multiple GVehicle(vehicle subtype) --> as GEngineVehicle and now make multiple
    // GEngineVehicle(vehicle subtype) classes for each vehicle
    public static void main(String[] args) {
//        Vehicle v1 = new Car();
//        Vehicle v2 = new Bicycle();
//        Vehicle v3 = new MotorCycle();
//        System.out.println("Car has " + v1.getNumberOfWheels() + " wheels and has engine: " + v1.hasEngine().toString());
//        System.out.println("MotorCycle has " + v3.getNumberOfWheels() + " wheels and has engine: " + v3.hasEngine().toString());
//        System.out.println("Bicycle has " + v2.getNumberOfWheels() + " wheels and has engine: " + v2.hasEngine().toString());

//        here we are creating a more generic Vehicle class which will be common to all the vehicles. Name - GVehicle and now make multiple GVehicle(vehicle subtype) classes for each vehicle
//        this code will not throw any null pointer exception because we are not using the hasEngine method in the Vehicle class
        GVehicle v1 = new GCar();
        GVehicle v2 = new GBicycle();
        GVehicle v3 = new GMotorCycle();
        System.out.println("Car has " + v1.getNumberOfWheels() + " wheels");
        System.out.println("MotorCycle has " + v3.getNumberOfWheels() + " wheels");
        System.out.println("Bicycle has " + v2.getNumberOfWheels() + " wheels");
    }
}
