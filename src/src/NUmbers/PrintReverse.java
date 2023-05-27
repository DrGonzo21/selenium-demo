package NUmbers;
import java.util.*;
import java.util.Scanner;

public class PrintReverse {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int x = inp.nextInt();
        //write your code below
        int i = 0;

        for (i = x - 1; i > -1; i--) {
            System.out.print(" " + i);
        }
    }
}
