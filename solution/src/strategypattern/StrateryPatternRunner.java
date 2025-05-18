package strategypattern;

import strategypattern.withstrategy.SportsVehicle;
import strategypattern.withstrategy.Vehicle;

public class StrateryPatternRunner {
    public static void main(String[] args) {
        Vehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();
    }
}
