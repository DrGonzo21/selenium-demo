package Assignments;

import OOP.PoliceCruiser;
import OOP.Vehicle;

import java.util.Scanner;

public class ASS25Tester {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("******************** TOLL ADMINISTRATION APPLICATION ********************");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Enter the number of vehicles to calculate the toll for: ");
        int numOfVehicles = scan.nextInt();

        ASS25Vehicle[] vehicles = new ASS25Vehicle[numOfVehicles];
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------");

        for (int i = 0; i < numOfVehicles; i++) {
            System.out.println();
            System.out.println("Enter the details of Vehicle #" + (i+1));
            System.out.println();
            System.out.print("Enter type : car, truck, or police: ");
            String type = scan.next();
            System.out.println();
            System.out.print("Enter distance traveled: ");
            double distance = scan.nextDouble();
            System.out.println();

            if(type.equalsIgnoreCase("car")){
                System.out.println();
                System.out.println("Does the car have a trailer? true / false: ");
                boolean hasTrailer = scan.nextBoolean();
                System.out.println();
                System.out.println("Is the car Hov3+ ? true / false: ");
                boolean isHov = scan.nextBoolean();
                System.out.println();
                ASS25Car car = new ASS25Car(distance,hasTrailer,isHov);
                System.out.println();
                vehicles[i] = car;

            }else if (type.equalsIgnoreCase("truck")){
                System.out.println();
                System.out.println("Enter the number of axles: ");
                int noOfAxles = scan.nextInt();
                System.out.println();
                ASS25Truck truck = new ASS25Truck(distance,noOfAxles);
                    vehicles[i] = truck;
                    System.out.println();

            }else if (type.equalsIgnoreCase("police")){
                System.out.println();
                ASS25PoliceCruiser cruiser = new ASS25PoliceCruiser(distance);
                vehicles[i] = cruiser;
                System.out.println();

            } else {
                System.out.println("Vehicle unknown. Skipping to next vehicle");
                System.out.println("-------------------------------------------------------------------------------");
                continue;
            }
            System.out.println();
            System.out.println("\n Toll Information for All Vehicles: ");
            System.out.println();
            for(ASS25Vehicle vehicle : vehicles){

                if(vehicle != null){
                    System.out.println(vehicle.toString());
                    System.out.println("----------------------------------------------------------------------------");
                }
            }
            System.out.println();
            System.out.println("Thank you for using the TAA! Have a great day!");
            System.out.println();
        }

    }
}
