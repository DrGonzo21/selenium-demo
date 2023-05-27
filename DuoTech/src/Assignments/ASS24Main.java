package Assignments;

import java.util.Scanner;

public class ASS24Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("******************** DUOTECH EMAIL MANAGEMENT APPLICATION ********************");
        System.out.println("------------------------------------------------------------------------------");

        System.out.print("Enter the number of emails to generate: ");

        int numEmails = scanner.nextInt();
        scanner.nextLine();

        ASS24Email[] emails = new ASS24Email[numEmails];

        for (int i = 0; i < numEmails; i++) {

            System.out.println("\nCreating email #" + (i + 1) + ":");
            System.out.println("Enter email type: " + "\n 1 for student: " + "\n 2 for staff: ");

            int emailType = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter first name: ");
            String firstName = scanner.nextLine();

            System.out.println("Enter last name: ");
            String lastName = scanner.nextLine();

            if (emailType == 1) {
                System.out.println("Enter batch number: ");
                int batchNumber = scanner.nextInt();
                emails[i] = new ASS24Student(firstName, lastName, batchNumber);

            } else if (emailType == 2) {
                System.out.println("Enter department ID: " + "\n 1.Accounting: " + " \n 2.Sales: " + "\n 3.Marketing: "  + "\n 4.Instructors: ");
                int departmentId = Integer.parseInt(scanner.nextLine());
                emails[i] = new ASS24Staff(firstName, lastName,departmentId );
            }
        }
        System.out.println("An email has been created...");
        System.out.println("------------------------------------------------------------------------------");

        System.out.println("\nEmails generated:");
        System.out.println();
        for (ASS24Email email : emails) {
            System.out.println(email.toString());
            System.out.println("**************************************************************************");
        }
        System.out.println("THANK YOU FOR USING DUOTECH EMA! GOODBYE!");
    }
}
