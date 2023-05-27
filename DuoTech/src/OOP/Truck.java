package OOP;

public class Truck extends Vehicle {
    private int noOfAxles;

    public Truck(double distanceTraveled, int noOfAxles) {

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

        switch (noOfAxles) {
            case 4:
                toll = 0.040 * getDistanceTraveled();
                break;

            case 6:
                toll = 0.045 * getDistanceTraveled();
                break;

            default:
                toll = 0.048 * getDistanceTraveled();
                break;
        }
        setToll(toll);
    }

    @Override
    public String toString() {
        return "Truck\t\t" + "Distance " + getDistanceTraveled() + "\t\t$" + getToll();
    }
}


