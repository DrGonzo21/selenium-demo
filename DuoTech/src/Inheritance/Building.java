package Inheritance;

public class Building {
    private String address;
    private int squareFootage;

    public Building(String address, int squareFootage) {
        this.address = address;
        this.squareFootage = squareFootage;
    }

    public String getAddress() {
        return address;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public String toString() {
        return "Address: " + address + ", Square Footage: " + squareFootage;
    }
}