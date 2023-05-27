package Conditionals;

public class conditional4 {
    //Given two int values, return true if they have the same last digit
    public static void main(String[] args) {
        System.out.println(lastDigit(7, 17)); //true
        System.out.println(lastDigit(114, 113)); //false
    }
        public static boolean lastDigit(int a, int b) {

            return Math.abs(a) % 10 == Math.abs(b) % 10;
        }
    }

