package Instancevariable;

public class StudentTest {

        public static void main(String[] args){

            // TEST your class implementation with the following main method code
            // Simply run the main method after finishing your class design and verify that all methods are working as intended

            Student hector = new Student();

            hector.name = "Hector";
            hector.grade = 10;
            hector.gpa = 3.9;
            hector.daysAbsent = 0;

            System.out.println("Student Name: " + hector.name);
            System.out.println("Student Grade: " + hector.grade);
            System.out.println("Student GPA: " + hector.gpa);

            System.out.println("Changing GPA...");
            hector.changeGPA(3.5);

            System.out.println("Student's New GPA: " + hector.gpa);


            System.out.println("Student graduated!");
            hector.graduate();
            System.out.println("Currently in grade: " + hector.grade);

            hector.checkAbsence(true);
            hector.checkAbsence(true);
            hector.checkAbsence(true);
            hector.checkAbsence(true);
            System.out.println(hector.name + " went a few days without attending classes..");
            System.out.println(hector.daysAbsent + " days, to be exact.");

            System.out.println("Here's the summary info for " + hector.name + ": ");
            hector.printInfo();
        }
    }
