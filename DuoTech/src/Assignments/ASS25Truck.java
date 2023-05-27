package Assignments;

public class ASS25Truck extends ASS25Vehicle {
    private int noOfAxles;

    public ASS25Truck(double distanceTraveled, int noOfAxles) {
        super(distanceTraveled);
        this.noOfAxles = noOfAxles;
        calculateToll();
    }

    public int getNoOfAxles() {
        return noOfAxles;
    }

    public void setNoOfAxles(int noOfAxles) {
        this.noOfAxles = noOfAxles;
    }

    @Override
    public void calculateToll() {
        double toll;
        if (noOfAxles == 4) {
            toll = getDistanceTraveled() * 0.040;
        } else if (noOfAxles == 6) {
            toll = getDistanceTraveled() * 0.045;
        } else if (noOfAxles >= 8) {
            toll = getDistanceTraveled() * 0.048;
        } else {
            System.out.println("This is not a valid selection. Price of axles will be default 4");
            toll = getDistanceTraveled() * 0.040;
        }
        setToll(toll);
    }

    @Override
    public String toString() {
        return "Truck\t\t" +
                "Distance =" + getDistanceTraveled() +
                "\t\t$= " + getToll();
    }
}