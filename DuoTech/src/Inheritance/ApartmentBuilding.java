package Inheritance;

public class ApartmentBuilding extends Building {
    private int totalUnits;

    public ApartmentBuilding(String address, int squareFootage, int totalUnits) {
        super(address, squareFootage);
        this.totalUnits = totalUnits;
    }

    public int getTotalUnits() {
        return totalUnits;
    }

    public String toString() {
        return super.toString() + ", Total Units: " + totalUnits;
    }
}