package OOP;
import java.util.Random;

public class OOPASSIGN22 {

        private String firstName;
        private String lastName;
        private int batchNo;
        private boolean isOnCampus;
        private double tuitionBalance;
        private String[] subjects;
        private String studentID;
        private static int numberOfStudentsCreated = 0;
        private static final String SCHOOL_NAME = "Duotech";

        public OOPASSIGN22(String firstName, String lastName, int batchNo,boolean isOnCampus) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.batchNo = batchNo;
            this.isOnCampus = isOnCampus;
            this.subjects = new String[] {"Java", "HTML", "Selenium", "Cucumber", "RestAssured", "SQL"};
            this.tuitionBalance = isOnCampus ? 5000.0 : 4000.0;
            this.studentID = generateStudentID();
            numberOfStudentsCreated++;
        }
        public String getSubjects(){
            return "[" + String.join(", ", subjects) + "]";
        }
        public String generateStudentID() {
            Random random = new Random();
            int randomNum = random.nextInt(900) + 100; // random 3-digit number
            return firstName.substring(0, 1) + lastName.substring(lastName.length() - 1) + batchNo + randomNum;
        }

        public String getStudentInfo() {
            return "STUDENT: " + firstName + " " + lastName + "\n" +
                    "SCHOOL: " + SCHOOL_NAME + "\n" +
                    "BATCH: " + batchNo + "\n" +
                    "STUDENT ID: " + studentID + "\n" +
                    "ON-CAMPUS: " + (isOnCampus ? "yes" : "no") + "\n" +
                    "SUBJECTS: " + getSubjects() + "\n" +
                    "TUITION BALANCE: " + tuitionBalance;
        }
        public void payTuition(double payment) {
            tuitionBalance -= payment;
            if (tuitionBalance > 0) {
                System.out.println("The new balance is $" + tuitionBalance);
            } else if (tuitionBalance < 0){
                System.out.println("The tuition is paid off.  A credit of " + Math.abs(tuitionBalance) + " dollars is applied to this account ");

            }else if (tuitionBalance - payment == 0){
                System.out.println("The tuition is paid off.");
            }
        }

        public double getTuition() {
            return tuitionBalance;
        }
        public static int getNumberOfStudentsCreated() {
            return numberOfStudentsCreated;
        }
    }

