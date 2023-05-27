package MethodParameters;
import java.util.Scanner;


public class parameters2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("This method is called print password: ");



        System.out.println("Enter String password: ");
        String a = scan.nextLine();

        System.out.println("Enter byte password: ");
        byte ab = scan.nextByte();

        System.out.println("Enter Long password: ");
        long abc = scan.nextLong();

        System.out.println("Enter float password: ");
        float cba = scan.nextFloat();

        System.out.println("Enter char password: ");
        char ba = scan.next().charAt(0);

        System.out.println("Enter boolen password: ");
        boolean d = scan.nextBoolean();

        System.out.println("Enter int password: ");
        int de = scan.nextInt();

        System.out.println("Enter char password: ");
        char bb = scan.next().charAt(0);


        System.out.println("print password: "+a +"," +ab +","+ abc +","+ cba +","+ ba +","+ d +","+ de +","+ bb);

        System.out.println("Output: ");
        System.out.println(bb+","+de+","+d+","+ba+","+cba+","+abc+","+ab+","+a);


    }
}
