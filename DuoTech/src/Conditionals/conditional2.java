package Conditionals;

public class conditional2 {
    public static void main(String[] args) {
        System.out.println(hasTeen(13, 20, 10));
        System.out.println(hasTeen(1, 20, 12));
    }

    public static boolean hasTeen(int a, int b, int c) {


        if (a > 12 && a <= 19)
            return true;
        if (b > 12 && b <= 19)
            return true;
        if (c > 12 && c <= 19)
            return true;
        else
            return false;

    }
}
