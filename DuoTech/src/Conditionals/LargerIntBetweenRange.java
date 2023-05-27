package Conditionals;

public class LargerIntBetweenRange {
    public static void main(String[] args) {

        //Tests

        System.out.println(max1020(19, 11)); // 19
        System.out.println(max1020(11, 19)); // 19
        System.out.println(max1020(11, 9)); // 11
        System.out.println(max1020(9, 21)); // 0
        System.out.println(max1020(21, 10)); // 10
        System.out.println(max1020(7, 20)); // 20
        System.out.println(max1020(10, 21)); // 10


    }


    public static int max1020(int a, int b) {
        // Check if a is in the range 10..20
        boolean aInRange = (a >= 10 && a <= 20);
        // Check if b is in the range 10..20
        boolean bInRange = (b >= 10 && b <= 20);

        // If both a and b are in the range, return the larger one
        if (aInRange && bInRange) {
            return Math.max(a, b);
        }
        // If only a is in the range, return a
        else if (aInRange) {
            return a;
        }
        // If only b is in the range, return b
        else if (bInRange) {
            return b;
        }
        // If neither a nor b is in the range, return 0
        else {
            return 0;
        }
    }
}