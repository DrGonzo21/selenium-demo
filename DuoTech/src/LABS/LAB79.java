package LABS;
import java.util.Scanner;
import java.util.Random;

public class LAB79 {

    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();

        // fill the array with random values from 1-50
        for (int i = 0; i < 10; i++) {
            array[i] = rand.nextInt(50) + 1;
        }

        // display the values in the array
        System.out.println("The values in the array are:");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + array[i]);
        }

        // prompt the user for an integer
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + " Enter an integer to search for: ");
        int searchValue = scanner.nextInt();

        // search for the value in the array
        boolean found = false;
        for (int i = 0; i < 10; i++) {
            if (array[i] == searchValue) {
                System.out.printf("The value %d is located in slot %d\n", searchValue, i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.printf("The value %d is not in the array\n", searchValue);
        }
    }
}

//    First, we declare an array of integers array with a size of 10, and a Random object rand to generate random numbers.

//    We then use a for loop to fill the array with random values between 1-50, and then use another for loop to print out each value in the array.

//    Next, we prompt the user for an integer using the Scanner class, and store the user's input in the variable searchValue.

//    We then use another for loop to search through the array for the value, and print a message indicating the slot number where the value was found if it is found.

//    If the value is not found, we print a message indicating that it is not in the array.

//    Note that we use printf method instead of print method with format string to print formatted output in Java.



