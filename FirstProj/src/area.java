import java.util.Scanner;

public class area {

        public static void main(String[] args) {
            double radius, area;


            System.out.println("this program calculates the area of the a circle given the radius");


            System.out.println("Please enter radius:   ");


         Scanner input = new Scanner(System.in);  // creates an input object

           //scanner class is a specific class for Java thats allows

            // get the radius

            radius = input.nextDouble();  // remember to use this code to have it work with keyboard input

            // Calculate the area ->area = radius * 3.14

            area = 3.14 * radius * radius;


            // display the result to the user
            System.out.println("the area of the circle with radius " + radius + " is " + area);


    }
}
