package assignments;

public class Areacalculator {
    public static void main(String[] args) {
        System.out.println("this program calculates the area of the a circle given the radius");

      double radius, area;

        // get the radius

      radius = 3.2;

        // Calculate the area ->area = radius * 3.14

        area = 3.14 * radius * radius;


        // display the result to the user
        System.out.println("the area of the circle is:" + area);
        System.out.println();
    }
}
