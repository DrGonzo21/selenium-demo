package OOP;

import java.util.Scanner;

class OOPASSIGN22Tester {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.println("******************** DUOTECH STUDENT MANAGEMENT APPLICATION ********************");
        System.out.println("---------------------------------------------------------------------------------");


        Scanner input = new Scanner(System.in);
        boolean continueAdding = true;

        do {

            System.out.println("Enter student's first name:");
            String firstName = input.nextLine();
            System.out.println("Enter student's last name:");
            String lastName = input.nextLine();
            System.out.print("Batch number: ");
            int batchNo = scanner.nextInt();
            System.out.println("On-campus? (yes/no)");
            String onCampusStr = input.nextLine();
            boolean isOnCampus = onCampusStr.equalsIgnoreCase("yes");
            System.out.println();
            System.out.println("Creating new Student...");
            System.out.println();
            System.out.println("Here's the information about the new Student:");
            System.out.println("----------------------------------------------------------------------");
            OOPASSIGN22 Student = new OOPASSIGN22(firstName,lastName,batchNo,isOnCampus);
            System.out.println(Student.getStudentInfo());
            System.out.println();
            System.out.println("----------------------------------------------------------------------");
            System.out.println("What is the amount being paid by the student today:");
            System.out.println("----------------------------------------------------------------------");
            double payment = Double.parseDouble(input.nextLine());
            Student.payTuition(payment);
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Number of students created: " + Student.getNumberOfStudentsCreated());
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Would you like to add another student? (yes/no)");
            String continueAddingStr = input.nextLine();
            continueAdding = continueAddingStr.equalsIgnoreCase("yes");
        } while (continueAdding);

        System.out.println("\nTHANK YOU FOR USING DUOTECH STUDENT MANAGEMENT APPLICATION. GOODBYE!");

    }
}
