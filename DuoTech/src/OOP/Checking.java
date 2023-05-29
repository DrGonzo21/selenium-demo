package OOP;
import java.util.*;

public class Checking extends Account {


    private String debitCardNo;
    private int debitCardPIN;

    public Checking(String name, String ssn, double balance) {
        super(name, ssn, balance);
        accountNumber = "1" + accountNumber;
        debitCardNo = generateDebitCardNo();
        debitCardPIN = generateRandomPIN();
        setInterestRate();
    }

    @Override
    public void setInterestRate() {
        interestRate = 0.15 * super.interestRate;
    }

    private String generateDebitCardNo() {
        Random random = new Random();
        long randomDigits = random.nextLong() % 9000000000000000L + 1000000000000000L;
        return "9" + Math.abs(randomDigits);
    }

    private int generateRandomPIN() {
        return new Random().nextInt(9000) + 1000;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("ACCOUNT TYPE: CHECKING " + "\nDEBIT CARD NUMBER: " + debitCardNo + "\nDEBIT CARD PIN: " + debitCardPIN + "\nINTEREST RATE: " + interestRate + "%");

    }
}