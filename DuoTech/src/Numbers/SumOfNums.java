package Numbers;
import java.util.*;

public class SumOfNums {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1-999:");

        int number = scan.nextInt();

        int sum = 0;

        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;

        }
        System.out.println(sum);
    }
}
