package Modulo;

import java.util.Scanner;

public class SumOf3Digits {
    public class practice {


        //    Create a program that gets input from the user as an integer number between 1-999
//    (1 and 999 included) and calculates the sum of the digits of the entered number.
//    (The code for getting the input has already been written for you)
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number between 1-999:");

            int number= scan.nextInt();

            int a = number % 10; //99(9)
            number /= 10; //999 -> 99

            int b = number % 10;//9(9)
            number /= 10; // 99 -> 9

            int c = number % 10;//(9)


            int result = a + b + c;

            System.out.println("The result is: " + result);

        }
    }

}
