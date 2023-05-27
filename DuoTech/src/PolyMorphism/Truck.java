package PolyMorphism;

public class Truck extends Vehicle {
    private double cargoCapacity;

    public Truck(String make, String model, int year, int topspeed, double cargoCapacity) {
        super(make, model, year, topspeed);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
    public void drive(){
        System.out.println(" The " + getMake()+", " + getModel()+ ", "+ getYear() + "can drive up to  " + getTopspeed() +". " +  getModel() +" has " + cargoCapacity + " cargo capacity ");
    }
}