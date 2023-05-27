package ClassTask;
import java.util.Scanner;

public class CLASSTASK16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int i = scan.nextInt();

        if (i >= 16){
            System.out.println(" You can get your driver license");
        } else if (i < 16) {
            System.out.println(" You can't get your drive5r license");
        } if (i >= 18){
            System.out.println(" You can vote ");
        } else if (i < 18) {
            System.out.println(" You can't vote ");
        } if (i >= 25){
                System.out.println(" You can rent a car ");
            } else if (i < 25){
                System.out.println(" You can't rent a car ");
                 } if (i <= 25){
                    System.out.println(" You can do anything because that's legal ");
                }

            }

        }


