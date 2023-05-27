package Instancevariable;

public class Student {

        String name;
        int grade;
        double gpa;
        int daysAbsent;
        boolean isAbsent;

        public Student(){
            this.name = "";
            this.grade = 0;
            this.gpa = 0.0;
            this.daysAbsent = 0;
            this.isAbsent = false;
        }
        public void changeGPA(double newGPA){
            this.gpa = newGPA;
        }
        public void changeName(String newName){
            this.name = newName;
        }
        public void graduate(){
            grade++;

        }
        public void checkAbsence(boolean isAbsent){
            if (isAbsent == true){
                this.daysAbsent++;
            }
            this.isAbsent = isAbsent;
        }

        public void printInfo(){
            System.out.println("NAME: " + name);
            System.out.println("GRADE: " + grade);
            System.out.println("GPA: " + gpa);
            System.out.println("DAYS ABSENT: " + daysAbsent);
        }
    }



