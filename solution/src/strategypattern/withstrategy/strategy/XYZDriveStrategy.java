package strategypattern.withstrategy.strategy;

public class XYZDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("XYZ Driving Capability");
    }
}
