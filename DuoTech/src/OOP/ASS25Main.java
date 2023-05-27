package OOP;

import java.util.Scanner;

public class ASS25Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("******************** TOLL ADMINISTRATION APPLICATION ********************");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Enter the number of vehicles to calculate the toll for: ");
        int numOfVehicles = scanner.nextInt();


        Vehicle[] vehicles = new Vehicle[numOfVehicles];
        System.out.println();
        System.out.println("------------------------------------------------------------------------------");


        for (int i = 0; i < numOfVehicles; i++) {
            System.out.println();
            System.out.println("Enter the details of Vehicle #" + (i+1));
            System.out.println();
            System.out.print("Enter type : car, truck, or police: ");
            String type = scanner.next();
            System.out.println();
            System.out.print("Enter distance traveled: ");
            double distance = scanner.nextDouble();
            System.out.println();

            if (type.equalsIgnoreCase("car")) {
                System.out.println();
                System.out.print("Does the car have a trailer ? (true/false): ");
                boolean hasTrailer = scanner.nextBoolean();
                System.out.println();
                System.out.print("Is the car HOV3+ ? (true/false): ");
                boolean isHov = scanner.nextBoolean();
                System.out.println();
                Car car = new Car(distance, hasTrailer, isHov);
                System.out.println();
                vehicles[i] = car;

            } else if (type.equalsIgnoreCase("truck")) {
                System.out.println();
                System.out.print("Enter the number of axles: ");
                int noOfAxles = scanner.nextInt();
                System.out.println();
                Truck truck = new Truck(distance, noOfAxles);
                vehicles[i] = truck;
                System.out.println();

            } else if (type.equalsIgnoreCase("police")) {
                System.out.println();
                PoliceCruiser cruiser = new PoliceCruiser(distance);
                vehicles[i] = cruiser;
                System.out.println();

            } else {
                System.out.println("Unknown vehicle type. Skipping to next vehicle.");
                System.out.println("------------------------------------------------------------------------------");
                continue;
            }
            System.out.println();
            System.out.println(vehicles[i].toString());
            System.out.println("------------------------------------------------------------------------------");
        }
        System.out.println();
        System.out.println("\nToll Information for All Vehicles:");
        System.out.println();
        for (Vehicle vehicle : vehicles) {

            if (vehicle != null) {
                System.out.println(vehicle.toString());
                System.out.println("------------------------------------------------------------------------------");
            }
        }

        System.out.println();
        System.out.println("THANK YOU FOR USING THE TAA! GOODBYE!");
        System.out.println();
    }
}
