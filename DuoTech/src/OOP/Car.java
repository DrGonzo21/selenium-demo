package OOP;

public class Car extends Vehicle{

   private boolean hasTrailer;
   private boolean isHov;

    public Car(double distanceTraveled, boolean hasTrailer, boolean isHov) {

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

        double toll = 0.020 * getDistanceTraveled();

        if (isHov) {
            toll = 0;
        }
        if (hasTrailer) {
            toll += 1.00;
        }
        setToll(toll);
    }
        public String toString() {
            return "Car\t\t" + "Distance " + getDistanceTraveled() + "\t\t$" + getToll();
        }
        }


