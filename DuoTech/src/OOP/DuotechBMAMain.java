package OOP;

import java.io.File;
import java.util.*;

public class DuotechBMAMain {


    public static void main(String[] args) {

        System.out.println("******************** DUOTECH BANK ACCOUNT MANAGEMENT APPLICATION ********************");
        System.out.println("-------------------------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        List<Account> accounts = new ArrayList<>();

        String choice;
        do {
            System.out.print("Enter the name of the CSV file: ");
            String fileName = scanner.nextLine();

            List<List<String>> data = Utility.readFromCSV(fileName);
            data.remove(0); // Remove header row

            for (List<String> record : data) {
                String accountType = record.get(2);
                String name = record.get(0);
                String ssn = record.get(1);
                double balance = Double.parseDouble(record.get(3).trim());

                if (accountType.equals("Checking")) {
                    accounts.add(new Checking(name, ssn, balance));
                } else if (accountType.equals("Savings")) {
                    accounts.add(new Savings(name, ssn, balance));
                } else {
                    System.out.println("Invalid account type: " + accountType);
                }
            }

            System.out.println("Bank Accounts Created:");
            for (Account account : accounts) {
                System.out.println("------------------------------------------");
                account.showInfo();
                System.out.println("------------------------------------------");
            }

            System.out.print("Do you want to load another file? (yes/no): ");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("THANK YOU FOR USING DUOTECH BMA! GOODBYE!");
    }
}





