package Assignments;

public class ASS25Car extends ASS25Vehicle{

   private boolean hasTrailer;
   private boolean isHov;

    public ASS25Car(double distanceTraveled, boolean hasTrailer, boolean isHov) {
        super(distanceTraveled);
        this.hasTrailer = hasTrailer;
        this.isHov = isHov;
        calculateToll();
    }

    public boolean isHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    public boolean isHov() {
        return isHov;
    }

    public void setHov(boolean hov) {
        isHov = hov;
    }

    @Override
    public void calculateToll() {
        double toll = getDistanceTraveled() * 0.020;

        if(isHov){
            toll = 0;
        }
        if(hasTrailer){
            toll += 1.0;
        }
        setToll(toll);
    }

    @Override
    public String toString() {
        return "Car\t\t" +
                "Distance =" + getDistanceTraveled() +
                "\t\t$= " + getToll();
    }
}
