package ArrayLists;

import java.util.Scanner;

public class ShapeTester {
    public static void main(String[] args) {

        //  Shape shape = new Shape(); // abstract classes cannot be instantiated , shape cannot be called because once a class becomes abstract you cannot call it

        System.out.println(" Enter your choice: ");

        int choice = new Scanner(System.in).nextInt();
        Shape shape;

        if (choice == 1) {
             shape = new Cirle("blue", 44);

        } else {
            shape = new Rectangle("green", 23, 44);

        }
        System.out.println(shape.getArea());
    }
}

