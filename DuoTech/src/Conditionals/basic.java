package Conditionals;
import java.util.Scanner;

public class basic {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("In: ");
        int num = inp.nextInt();


        if (num > 0){
            System.out.println("positive");

        }else{
            System.out.println("negative");
        }
    }
}
