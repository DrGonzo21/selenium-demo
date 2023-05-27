package Instancevariable;

public class Rectanglemain {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        rec1.width = 4;
        rec1.height = 40;
        System.out.println("Rectangle 1:");
        System.out.println(rec1.width);
        System.out.println(rec1.height);
        System.out.println(rec1.getArea());
        System.out.println(rec1.getPerimeter());

        Rectangle rec2 = new Rectangle();
        rec2.width = 3.5;
        rec2.height = 35.9;
        System.out.println("Rectangle 2:");
        System.out.println(rec2.width);
        System.out.println(rec2.height);
        System.out.println(rec2.getArea());
        System.out.println(rec2.getPerimeter());

    }
}
