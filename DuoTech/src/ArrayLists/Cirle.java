package ArrayLists;

public class Cirle extends Shape{

    private double radius;

    public Cirle(String color,double radius) {
        super(color);
        this.radius = radius;
    }



    @Override
    public double getArea() {
        System.out.println("Circle: " );
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
    return 2 * Math.PI * radius;
    }
}
