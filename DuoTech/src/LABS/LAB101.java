package LABS;

public class LAB101 {
//    Create 3 overloaded methods called getArea to calculate the areas of the following geometric shapes:
// 1. calculates and returns the area of a circle based on the radius. The formula: Area = p * r * r where p is PI and r is radius.
// 2. calculates and returns the area of a rectangle based on the width and height. The formula: Area = width * height.
// 3. calculates and returns the area of a cylinder based on the radius and height. Area = 2 * p * r * r * h where p is PI and r is radius, h is height.

    public static void main(String[] args) {
        System.out.println("Circle Area is: " + getArea(25));
        System.out.println("Rectangle Area is: " + getArea(13, 15));
        System.out.println("Cylinder Area is: " + getArea(25.0,40.0));
    }

    private static final double PI = 3.14159;

    public static double getArea(double radius){
        return PI * radius * radius;
        // Area = p * r * r where p is PI and r is radius.
    }

    public static int getArea(int width, int height){
        return width * height;
        // The formula: Area = width * height.
    }

    public static double getArea(double radius, double height){
        return 2 * PI * radius * radius * height;
        // Area = 2 * p * r * r * h where p is PI and r is radius, h is height.
    }
}
