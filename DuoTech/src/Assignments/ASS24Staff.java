package Assignments;

public class ASS24Staff extends ASS24Email{
    private int departmentId;
    private static final String[] DEPARTMENTS = {"Accounting","Sales","Marketing","Instructors"};

    public ASS24Staff(String firstName, String lastName, int departmentId) {
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
    public String getDeprtments(){
        return DEPARTMENTS[departmentId -1];
    }

    public String generateEmail() {
        String email = getFirstName() + "." + getLastName() + "_d" + departmentId + "@" + DEPARTMENTS + DOMAIN_NAME;
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

    }

