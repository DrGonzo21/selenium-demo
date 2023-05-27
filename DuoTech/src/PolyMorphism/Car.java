package PolyMorphism;

public class Car extends Vehicle{

   private int numDoors;


    public Car(String make, String model, int year, int topspeed, int numDoors) {
        super(make, model, year, topspeed);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }



    public void drive(){

        System.out.println(" The "  + getMake()+", " + getModel()+ ", "+ getYear() + " can drive up to  " + getTopspeed() +". " + " This car has " + numDoors + " Doors");

    }
}

