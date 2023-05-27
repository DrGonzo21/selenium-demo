package Queue;

public class Student {

    private String name;
    private int id;
    private double height;

    public Student(String name, int id, double height) {
        this.name = name;
        this.id = id;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", height=" + height +
                '}';
    }
}
