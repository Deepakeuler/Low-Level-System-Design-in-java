package strategypattern.withstrategy;

import strategypattern.withstrategy.strategy.SportsDriveStrategy;

public class OffRoadingVehicle extends Vehicle {
    public OffRoadingVehicle() {
        super(new SportsDriveStrategy());
    }
}
