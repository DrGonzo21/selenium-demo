package ClassTask;

public class ClassTask57Tester {
    public static void main(String[] args) {

        ClassTask57 student = new ClassTask57("Bob Dole", 26, "VA", true, new double[]{78, 88, 95}, 10000.0);

        System.out.println(student.getInfo());
        System.out.println("Average grade: " + student.getAverageGrade());
        System.out.println("Tuition payment: " + student.getTuition());
        student.payTuition(5000.0);
        System.out.println("Tuition after payment: " + student.getTuition());
    }
}

