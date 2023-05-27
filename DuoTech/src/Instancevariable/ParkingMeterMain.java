package Instancevariable;

public class ParkingMeterMain {

    public static void main(String[] args) {

        ParkingMeter meter = new ParkingMeter();

        boolean increased = meter.add(25);
        System.out.println("Time left increased: " + increased);

        for (int i = 0; i < 10; i++) {
            meter.tick();
        }
        boolean expired = meter.isExpired();
        System.out.println("Time is expired: " + expired);
    }
}