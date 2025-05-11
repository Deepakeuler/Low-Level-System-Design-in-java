package liskovSubstitution.withLiskov;

public class GCar extends GEngineVehicle{

    @Override
    public int getNumberOfWheels() {
        return 4;
    }
}
