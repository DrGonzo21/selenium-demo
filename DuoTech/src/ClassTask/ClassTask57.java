package ClassTask;

public class ClassTask57 {
    String name;
    int age;
    String state;
    boolean isOnline;
    double [] grades;
    double tuition;


    public ClassTask57(String name, int age, String state, boolean isOnline, double [] grades, double tuition){
        this.name = name;
        this.age = age;
        this.state = state;
        this.isOnline = isOnline;
        this.grades = grades;
        this.tuition = tuition;


    }

    public String getInfo(){
        return "Name: " + this.name +" , " + " Age: " + this.age +" , "+ " State: " + this.state;


    }
    public double getAverageGrade(){
        double sum = 0;
        for(int i = 0; i< grades.length;i++){
            sum += grades[i];

        }
        return (double) sum / grades.length;
    }
    public double payTuition(double amount){
        return tuition -= amount;
    }
    public double getTuition(){
        return tuition;
    }





}

