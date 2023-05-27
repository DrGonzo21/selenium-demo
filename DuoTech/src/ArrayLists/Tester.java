package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("What type of student do you want to add: 1. Online, 2. In-class");
        int choice = scan.nextInt();
        scan.nextLine(); // consume the newline character

        String answer = "yes";

        do {
            System.out.println("Please enter name: ");
            String name = scan.nextLine();

            System.out.println("Please enter ID:");
            long id = scan.nextLong();
            scan.nextLine(); // consume the newline character

            if (choice == 1) {
                System.out.println("Does the student have an extra monitor? (true/false)");
                boolean hasExtraMonitor = scan.nextBoolean();


            } else if (choice == 2) {
                System.out.println("Please enter campus ID:");
                int campusId = scan.nextInt();


            } else {
                System.out.println("Invalid choice.");
                break;
            }

            System.out.println("Would you like to add more students? (yes/no)");
            answer = scan.nextLine();
        } while (answer.equalsIgnoreCase("yes"));

        System.out.println("List of students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}