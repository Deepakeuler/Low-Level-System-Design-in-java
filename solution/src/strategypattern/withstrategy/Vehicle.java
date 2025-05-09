package strategypattern.withstrategy;

import strategypattern.withstrategy.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObj;

    // Constructor injection
    public Vehicle(DriveStrategy driveObj) {
        this.driveObj = driveObj;
    }

    public void drive() {
        driveObj.drive();
    }
}
