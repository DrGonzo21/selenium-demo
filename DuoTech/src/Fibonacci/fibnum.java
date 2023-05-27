package Fibonacci;

public class fibnum {
    public static void main(String[] args) {
        printFibonacci(5);
    }

    public static void printFibonacci(int x) {
        int num1 = 0, num2 = 1;
        int count = 0;

        System.out.print(num1 + " " + num2 + " ");

        while (count < x) {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            count = count + 1;

        }
    }
}
