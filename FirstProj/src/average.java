import java.sql.SQLOutput;
import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        System.out.println("This gets the average of 2 numbers");
        System.out.println("Please enter the first number:    ");

        Scanner input = new Scanner(System.in);

        double first = input.nextDouble();

        System.out.println("Please enter the second number:    ");

        double second = input.nextDouble();

        System.out.println("The average is:  " +(first+second)/2 );
    }


}
