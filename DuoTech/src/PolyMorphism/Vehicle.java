package PolyMorphism;

public class Vehicle {

    private String make;
    private String model;
    private int year;
    private int topspeed;

    public Vehicle(String make, String model, int year, int topspeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.topspeed = topspeed;
    }

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getTopspeed() {
        return topspeed;
    }

    public void setTopspeed(int topspeed) {
        this.topspeed = topspeed;
    }
    public void drive(){
        System.out.println("The" + getMake()+", " + getModel()+ ", "+ getYear() + " can drive up to 80. But  " + getTopspeed() + " is its top speed.");
    }
}