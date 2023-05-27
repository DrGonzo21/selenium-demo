package AgeAssignments;
import java.util.Scanner;

public class ageMultiway {
    public static void main(String[] args) {
        AgeRights();
    }

    // call your method here
    public static void AgeRights() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter age: ");
        int age = scan.nextInt();

        if (age < 16) {
            System.out.println("You can't drive");
        } else if (age < 18) {
            System.out.println("You can drive but not vote");

        } else if (age < 25) {
            System.out.println("You can vote but not rent a car");

        } else if (age >= 25) {
            System.out.println("You can do pretty much anything");

        }
    }
}





