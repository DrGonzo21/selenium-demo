package TipCac;
import java.util.*;

public class TipCaculator {
    public static void main(String[] args) {


        System.out.println("*********************************************************");
        System.out.println("*                TIP CALCULATOR                         *");
        System.out.println("*********************************************************");

        //Write your code here


        System.out.println("Enter Bill amount: ");
        Scanner input = new Scanner(System.in);

        double first = input.nextDouble();

        System.out.println("Enter Tip Percentage: ");

        double second = input.nextDouble();

        System.out.println("Your Tip Amount is: " + (first * second) / 100);



    }
}
