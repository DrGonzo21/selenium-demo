import java.util.Scanner;

public class NumberSum3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int a = scan.nextInt();
        System.out.println("Please enter the third number");
        int b = scan.nextInt();
        System.out.println("P{lease enter the third number");
        int c = scan.nextInt();

        int result = a+b+c;

        System.out.println("The 3 number sum is: " + result);

    }
}
