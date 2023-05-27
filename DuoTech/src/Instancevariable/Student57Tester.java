package Instancevariable;

public class Student57Tester {
    public static void main(String[] args) {
        Student57 student = new Student57("Jerrod",33,"CA",true,new int[]{90,88,85,70},10000.0);

        System.out.println(student.getInfo());
        System.out.println("Average grade: "+student.getAverageGrade());
        System.out.println("Tuition befor payment: "+student.getTuition());
        student.payTuition(5000.0);
        System.out.println("Tuition after payment: "+student.getTuition());



    }
}
