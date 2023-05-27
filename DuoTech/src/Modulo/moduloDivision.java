package Modulo;
import java.util.Scanner;


public class moduloDivision {

    //Given a four digit integer from the input, find the difference between the multiplication and sum of its digits
    //e.g 5852 ->  multiplication 400 (5x8x5x2), sum 20 (5+8+5+2)  ->  400-20=380

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a four digit number: ");
        int num = s.nextInt();

        int a = num % 10;
        num /= 10;

        int b = num % 10;
        num /= 10;

        int c = num % 10;
        num /= 10;

        int d = num % 10;

        int multi = a*b*c*d;
        int sum = a+b+c+d;

        System.out.println(""+(multi-sum));
    }

}
