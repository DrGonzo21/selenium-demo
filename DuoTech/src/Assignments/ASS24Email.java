package Assignments;

public class ASS24Email {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;
    private int capacity;
    private int maxAttachmentSize;
    public static final String DOMAIN_NAME = "Doutech.io";

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getMaxAttachmentSize() {
        return maxAttachmentSize;
    }

    public void setMaxAttachmentSize(int maxAttachmentSize) {
        this.maxAttachmentSize = maxAttachmentSize;
    }

    public ASS24Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String generateEmail() {
        String email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@"+ DOMAIN_NAME;
        setEmailAddress(email);
        return email;
    }
    public String generatePassword(){
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()1234567890";
        StringBuilder sb = new StringBuilder(10);
        for (int i = 0; i < 10; i++) {
            int index = (int) (Math.random() * chars.length());
            sb.append(chars.charAt(index));
        }
        setPassword(sb.toString());
        return getPassword();

        }

    }

