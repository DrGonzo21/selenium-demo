package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityDemo2 {

    public static void main(String[] args) {

        Queue<Student> student = new PriorityQueue<>(Comparator.comparing(Student :: getName)); // you could change getName for any of the custom classes that you made and use them to sort the information

        student.offer(new Student("Jerrod",23,184.34));
        student.offer(new Student("Karman",11,187.22));
        student.offer(new Student("Alina",12,179.23));
        student.offer(new Student("Zangief",99,195.22));

        while(!student.isEmpty()){
            System.out.println("Now serving: " + student.poll());
        }
    }
}
