package OOP;
import java.util.Random;

public class Staff extends Email {

    private int departmentId;
    private static final String[] DEPARTMENTS = {"Accounting", "Sales", "Marketing", "Instructors"};

    public Staff(String firstName, String lastName, int departmentId) {
        super(firstName, lastName);
        this.departmentId = departmentId;
        setEmailAddress(generateEmail());
        setPassword(generatePassword());
        setCapacity(50);
        setMaxAttachmentSize(100);
    }
    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartment() {
        return DEPARTMENTS[departmentId - 1];
    }

    @Override
    public String generateEmail() {
        return getFirstName() + "." + getLastName() + "_d" + departmentId +
                "@" + getDepartment().toLowerCase() + "." + DOMAIN_NAME;
    }

    @Override
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



    @Override
    public String toString() {
        return "TYPE: Staff\n" +
                "DEPARTMENT: " + getDepartment() + "\n" +
                super.toString();
    }
}
