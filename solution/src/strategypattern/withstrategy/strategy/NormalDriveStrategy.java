package strategypattern.withstrategy.strategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal driving capability");
    }
}
