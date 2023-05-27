package Queue;

import java.util.Queue;

public class PriorityQueue {

    public static void main(String[] args) {

        Queue<String> names = new java.util.PriorityQueue<>(); // priority queue is based on the order of the items e.g (string) is pulled in order on the assii tables
        // and for ints its in order as well. even if you print out the it will put the items in order

        names.offer("Bob");
        names.offer("Jerrod");
        names.offer("Alice");
        names.offer("Xaiver");
        names.offer("Zaingef");

        System.out.println(names);

        while(!names.isEmpty()){
            System.out.println("Now serving: " + names.poll());
        }


    }
}
