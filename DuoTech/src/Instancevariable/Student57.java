package Instancevariable;

public class Student57 {
    String name;
    int age;
    String state;
    boolean isOnline;
    int [] grades;
    double tuition;

    public Student57(String name, int age, String state, boolean isOnline, int[] grades, double tuition) {
        this.name = name;
        this.age = age;
        this.state = state;
        this.isOnline = isOnline;
        this.grades = grades;
        this.tuition = tuition;
    }
    public Student57() {
        this.name = "Jerrod";
        this.age = 33;
        this.state = "CA";
        this.isOnline = true;
        this.grades = new int[]{};
        this.tuition = 10000.0;
    }
    public Student57(String name) {
        this.name = name;
    }
    public String getInfo() {
        return this.name + " " + this.age + " " + this.state;
    }
    public int getAverageGrade() {
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return (int) sum / grades.length;
    }
    public double payTuition(double amount) {
        return tuition -= amount;
    }
    public double getTuition() {
        return tuition;
    }

    }

