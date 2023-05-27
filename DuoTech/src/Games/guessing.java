package Games;
import java.util.Random;
import java.util.Scanner;


public class guessing {
    public static void main(String[] args) {

        Random r = new Random();
        int ComputerGuess = r.nextInt(100);
        int tries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;


        while (win == false) {

            System.out.println("Guess the number between 0 - 100 :");

            guess = input.nextInt();
            tries++;

            if (guess == ComputerGuess) {
                win = true;
            }
            if (guess < ComputerGuess) {
                System.out.println("Your guess is too low:");

            }
            if (guess > ComputerGuess) {
                System.out.println("Your guess is too high:");
            }
        }
        System.out.println("You win!");
        System.out.println("The number was:" + ComputerGuess);
        System.out.println("It only took you " + tries + " tries");

    }
}
