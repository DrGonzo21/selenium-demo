package Inheritance;

public class PersonTester {
    public static void main(String[] args) {

        Student student = new Student("Jerrod", "6912 Radford","doutech",2023,8000);
        System.out.println(student.toString());

        Staff staff = new Staff("Akmal","doutech","Online",8000);
        System.out.println(staff.toString());
    }
}
