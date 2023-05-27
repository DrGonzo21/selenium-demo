package ClassTask;
import java.util.Scanner;

public class CLASSTASK26 {
    //    Create a program in the main method that simulates the ATM machine.
//    Your program should ask the user to enter the pin number. You can assume the pin number is 1441.
//    It should display an error message continuously if the pin is entered incorrectly.
//    When the pin is entered correctly, it should display the welcome message.
//            Use do-while loop.
//            EXTRA: add an option to lock the account and end the program after 3 tries.
//    If the user enters the pin wrong 3 times then you should
//    display a message "You entered wrong pin 3 times, your account is locked. Contact customer service."
    public static void main(String[] args) {

        final int MAX_ATTEMPTS = 3; // Maximum attempts to enter the correct pin
        int attempts = 0; // Counter for attempts made
        int pin = 1441; // The correct pin

        Scanner scanner = new Scanner(System.in);
        int enteredPin;

        do {
            System.out.print("Please enter your PIN: ");
            enteredPin = scanner.nextInt();
            attempts++;

            if (enteredPin != pin) {
                System.out.println("Invalid PIN. Please try again.");
                if (attempts == MAX_ATTEMPTS) {
                    System.out.println("You entered wrong pin 3 times, your account is locked. Contact customer service.");
                    return; // End the program
                }
            }
        } while (enteredPin != pin);

        System.out.println("Welcome to the ATM.");
        // Rest of the program...
    }
}
