package Instancevariable;

public class Practiceb {
    private static final double PI = 3.14159;

    public double Area(double radius){
       return PI * radius * radius;
    }
    public int getArea(int width, int height){
        return width * height;
    }
    public double getArea1(double radius, double height){
        return 2 * PI * radius * radius * height;
    }

}
