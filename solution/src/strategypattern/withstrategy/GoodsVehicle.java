package strategypattern.withstrategy;

import strategypattern.withstrategy.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
