package OOP;
import java.util.*;

public abstract class Account implements BasInterestRate {

    protected String name;
    protected String ssn;
    protected double balance;
    protected String accountNumber;
    protected String routingNumber;
    protected double interestRate;

    public Account(String name, String ssn, double balance) {
        this.name = name;
        this.ssn = ssn;
        this.balance = balance;
        this.accountNumber = generateAccountNumber();
        this.routingNumber = generateRoutingNumber();
        this.interestRate = getBaseInterestRate();
    }

    protected String generateAccountNumber() {
        String lastFourDigits = ssn.substring(ssn.length() - 4);
        int randomDigits = new Random().nextInt(9000000) + 1000000;
        return lastFourDigits + randomDigits;
    }

    protected String generateRoutingNumber() {
        int randomDigits = new Random().nextInt(9000000) + 1000000;
        return "00" + randomDigits;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Depositing $" + amount + " to the account. New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal denied.");
        } else {
            balance -= amount;
            System.out.println("Withdrawing $" + amount + " from the account. New balance: $" + balance);
        }
    }

    public void showInfo() {
        System.out.println("NAME: " + name);
        System.out.println("SSN: " + ssn);
        System.out.println("ACCOUNT NUMBER: " + accountNumber);
        System.out.println("ROUTING NUMBER: " + routingNumber);
        System.out.println("BALANCE: $" + balance);
    }
}