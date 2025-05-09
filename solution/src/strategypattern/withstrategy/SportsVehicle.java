package strategypattern.withstrategy;

import strategypattern.withstrategy.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }

}
