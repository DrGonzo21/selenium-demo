package OOP;
import java.util.Random;


public class Student extends Email {

    private int batchNo;

    public Student(String firstName, String lastName, int batchNo) {
        super(firstName, lastName);
        this.batchNo = batchNo;
        setEmailAddress(generateEmail());
        setPassword(generatePassword());
        setCapacity(25);
        setMaxAttachmentSize(50);
    }

    public String generateEmail() {

        String email = getFirstName() + "." + getLastName() + "_b" + batchNo + "@" + "student." + DOMAIN_NAME;
        setPassword(email);
        return email;
    }

    public String generatePassword() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()1234567890";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            int index = (int) (Math.random() * chars.length());
            sb.append(chars.charAt(index));
        }
        setPassword(sb.toString());
        return getPassword();

    }

    public String toString() {
        return "TYPE: Student \n BATCH NO: " + batchNo
                + "\n" + super.toString();
    }
}
