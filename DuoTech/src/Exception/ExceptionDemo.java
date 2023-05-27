package Exception;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {

        System.out.println("divide 2 numbers");

        System.out.println("enter number 1:");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();

        System.out.println("enter number 2");
        int num2 = scan.nextInt();

        try {
            String str = null;
            str.toUpperCase();
            System.out.println("The result is: " + num1 / num2);

        }catch (ArithmeticException e) {
            System.out.println("The second number cannot be zero, division cannot be performed");

            //end the program
            System.out.println("Program cannot execute further, terminating");
            System.exit(23);
        }catch (NullPointerException e){
            System.out.println("NP exception happened");

//        try {
//
//            //code that might throw ArithmeticException
//        }catch (ArithmeticException){
//            //logic of what happens when arithemticException happens
        }
    }
}
