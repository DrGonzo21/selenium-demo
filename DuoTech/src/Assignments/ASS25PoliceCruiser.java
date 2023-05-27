package Assignments;

public class ASS25PoliceCruiser extends ASS25Vehicle{
    public ASS25PoliceCruiser(double distanceTraveled) {
        super(distanceTraveled);

    }

    @Override
    public void calculateToll() {
        setToll(0);
    }

    @Override
    public String toString() {
        return  "Police Cruiser\t\t" +
                "Distance =" + getDistanceTraveled() +
                "\t\t$= " + getToll();
    }
}
