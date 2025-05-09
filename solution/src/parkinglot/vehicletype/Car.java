package parkinglot.vehicletype;

public class Car {
    private String licensePlate;
    private String color;
    private String model;

    public Car(String licensePlate, String color, String model) {
        this.licensePlate = licensePlate;
        this.color = color;
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    } 
}
