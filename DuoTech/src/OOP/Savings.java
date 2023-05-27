package OOP;
import java.util.*;




public class Savings extends Account {
    private int safetyDepositBoxID;
    private int safetyDepositBoxPin;

    public Savings(String name, String ssn, double balance) {
        super(name, ssn, balance);
        accountNumber = "2" + super.accountNumber;
        safetyDepositBoxID = generateRandomID();
        safetyDepositBoxPin = generateRandomPIN();
        setInterestRate();
    }

    @Override
    public void setInterestRate() {
        interestRate = super.getBaseInterestRate() - 0.25;
    }

    private int generateRandomID() {
        return new Random().nextInt(900) + 100;
    }

    private int generateRandomPIN() {
        return new Random().nextInt(8000) + 1000;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("ACCOUNT TYPE: Savings");
        System.out.println("SAFETY DEPOSIT BOX ID: " + safetyDepositBoxID);
        System.out.println("SAFETY DEPOSIT BOX PIN: " + safetyDepositBoxPin);
        System.out.println("INTEREST RATE: " + interestRate + "%");
    }
}