package LABS;

public class LAB106 {
    private String make;
    private String model;
    private int numberOfDoors;
    private int topSpeed;
    private double price;

    public LAB106() {
    }

    public LAB106(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public LAB106(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public LAB106(int topSpeed, double price) {
        this.topSpeed = topSpeed;
        this.price = price;
    }

    // Getters and Setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}