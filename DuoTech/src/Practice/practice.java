package Practice;

import java.util.*;

public class practice {

//    Write a program that converts a Fahrenheit degree to Celsius.
//
//    Please use Scanner to get the fahrenheit value.
//    Use the following formula to calculate the celsius

    public static void main(String[] args) {

        System.out.println("Please enter the  in fahrenheit");

        Scanner scan = new Scanner(System.in);

        double fahrenheit = scan.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(fahrenheit + " F is: " + celsius + "C");





    }
}
