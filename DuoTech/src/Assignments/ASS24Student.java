package Assignments;
import java.util.Random;

public class ASS24Student extends ASS24Email{
    private int batchNo;

    public ASS24Student(String firstName, String lastName, int batchNo) {
        super(firstName, lastName);
        this.batchNo = batchNo;
        setEmailAddress(generateEmail());
        setPassword(generatePassword());
        setCapacity(25);
        setMaxAttachmentSize(50);
    }
    public int getBatchNo(){
        return batchNo;
    }
    public void setBatchNo(int batchNo){
        this.batchNo = batchNo;
    }
        public String generateEmail() {
            String email = getFirstName().toLowerCase() + "." + getLastName().toLowerCase() + "_b" + batchNo + "@" + "student." + DOMAIN_NAME;
            setEmailAddress(email);
            return email;
        }
    public String generatePassword () {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()1234567890";
        StringBuilder sb = new StringBuilder(8);
        for (int i = 0; i < 8; i++) {
            int index = (int) (Math.random() * chars.length());
            sb.append(chars.charAt(index));
        }
        setPassword(sb.toString());
        return getPassword();
    }
        public String toString(){
        return "Type: Student\nBatch No: " + batchNo + "\n" + super.toString();
    }
}

