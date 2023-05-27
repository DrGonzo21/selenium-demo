package PolyMorphism;

public class Motorcycle extends  Vehicle{
    private boolean hasSideCar;

    public Motorcycle(String make, String model, int year, int topspeed, boolean hasSideCar) {
        super(make, model, year, topspeed);
        this.hasSideCar = hasSideCar;
    }

    public boolean isHasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }
    public void drive(){
        System.out.println( "The " + getMake()+", " + getModel()+ ", "+ getYear() + "can drive up to  " + getTopspeed() +". " + getModel() + " has " + hasSideCar + " sidecar ");
    }
}

