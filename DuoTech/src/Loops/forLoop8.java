package Loops;
import java.util.Scanner;


public class forLoop8 {
    //Write a for loop that will print out a series of numbers starting at one less than x and ending at 0.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = s.nextInt();

        int i = 0;

        for (i = x - 1; i > -1; i--) {

            System.out.println(" " + i);

        }
    }
}
