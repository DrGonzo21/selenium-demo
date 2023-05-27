package Games;
import java.util.Scanner;

public class atmMachine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int answer;
        int pin = 1441;
        int count = 0;
        do{

            if (count == 3) {
                System.out.println("Your account is locked");
                System.exit(1);
            }
            System.out.println("Please enter your pin, you have 3 trys :");
            answer = scan.nextInt();
            count++;

        }while (answer != 1441);
        System.out.println("Welcome");

    }
}

