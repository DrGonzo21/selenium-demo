package NUmbers;
import java.util.Scanner;

public class SumOfNums {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("#1: ");
        int num1 = s.nextInt();
        System.out.print("#2: ");
        int num2 = s.nextInt();
        //start on line 11

        if (num1 % 2 == 0) {
            num1++;
        }
        int sum = 0;

        for (int i = num1; i <= num2; i += 2) {
            sum = sum + i;
        }


        System.out.print(sum);
    }
}
