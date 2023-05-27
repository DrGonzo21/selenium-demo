package OOP;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("******************** DUOTECH EMAIL MANAGEMENT APPLICATION ********************");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Enter the number of emails to generate: ");

        int numEmails = scanner.nextInt();
        scanner.nextLine();

        Email[] emails = new Email[numEmails];
        for (int i = 0; i < numEmails; i++) {

            System.out.println("\n Creating email #" + (i + 1) + ":");
            System.out.println("Enter email type: " + "\n 1 for student: " + "\n 2 for staff: ");

            int emailType = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter first name: ");
            String firstname = scanner.nextLine();

            System.out.println("Enter last name: ");
            String lastname = scanner.nextLine();

            if (emailType == 1) {
                System.out.println("Enter batch number: ");
                int batchNo = scanner.nextInt();

                emails[i] = new Student(firstname, lastname, batchNo);

            } else if (emailType == 2) {
                System.out.println("Enter department ID: " + "\n 1. Accounting" + "\n 2.Sales" + "\n 3.Marketing" + "\n 4.Instructors");
                int departmentID = Integer.parseInt(scanner.nextLine());

                emails[i] = new Staff(firstname, lastname, departmentID);
            }
        }
        System.out.println("An email has been created...");
        System.out.println("------------------------------------------------------------------------------");

        System.out.println("\nEmails generated:");
        System.out.println();
        for (Email email : emails) {
            System.out.println(email.toString());
            System.out.println("**************************************************************************");
        }
        System.out.println("THANK YOU FOR USING DUOTECH EMA! GOODBYE!");

            }

            }
