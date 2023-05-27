package OOP;

public class PoliceCruiser extends Vehicle{
    public PoliceCruiser(double distanceTraveled) {

        super(distanceTraveled);
        calculateToll();
    }

    @Override
    public void calculateToll() {
        setToll(0);
    }

    @Override
    public String toString() {
        return "PoliceCruiser\t\t" + "Distance " + getDistanceTraveled() + "\t\t$" + getToll();
    }
}
