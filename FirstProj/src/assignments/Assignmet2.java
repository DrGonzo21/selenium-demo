package assignments;

import java.util.Scanner;

public class Assignmet2 {
    public static void main(String[] args) {
    // Estimate distance of trip in miles
        // Average mpg of the car that is going to be used for the trip.
        //current gas prices



        System.out.println("This program will calculate the estimated cost of gas for your trip");

        System.out.println("Please enter the distance that you are planning to travel:    ");

        Scanner input = new Scanner(System.in);

        double first = input.nextDouble();

        System.out.println("Please enter the average mpg of the car that you are planning to drive:    ");

        double second = input.nextDouble();
        System.out.println("PLease enter the current gas price:    ");


        double third = input.nextDouble();


        System.out.println("Estimated amount of gas for your trip is: "  +(first/second)+ " " +
                "" +
                "Gallons and estimated cost of gas is:"+ "$" +(first/second)*third);
       // "Gallons and estimated cost of gas is");
    }
}
