package Student;

public class tester {
    public static void main(String[] args) {
//        String str = new String();
//        student student = new student();
//        student student1 = new student();
//        student student2 = new student();
//
//        int i;
//       // student student; // variable of a student type
//        // it is not the actual object, it is currently a reference
//
//      student =  new student();// new student() -> actual object

        student student = new student("Jerrod","Software Engineer",33
        ,'M',true);
//        student.age = 33;
//        student.gender = 'm';
//        student.firstName = "Jerrod";
//        student.isOnline = true;  -> this isnt the best way to assign values to the variables

        System.out.println(student.age);
        System.out.println(student.firstName);
        System.out.println(student.isOnline);
        System.out.println(student.major);
        System.out.println(student.gender);
        System.out.println(student.getFullName());
        System.out.println("current absences: " + student.numberOfAbsents);
        student.getAbsents();
        System.out.println("current absences now: " + student.numberOfAbsents);

    }
}
