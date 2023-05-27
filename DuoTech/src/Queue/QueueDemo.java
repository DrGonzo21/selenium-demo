package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        // Queue is a data structure that uses First-In-First-Out (FIFO)

        Queue<String> tickets = new LinkedList<>();

        tickets.offer("A1");
        tickets.offer("B1");
        tickets.offer("R1");
        tickets.offer("A2");
        tickets.offer("R2");
        tickets.offer("D1");

        System.out.println(tickets);


        System.out.println("The ticket at the head of the queue is: " + tickets.peek());

        System.out.println("the first ticket is called: " + tickets.poll());

        System.out.println(" the queue after the first call is: " + tickets.peek());

        while(!tickets.isEmpty()){
            System.out.println("Now serving: " + tickets.poll());
        }

    }
}
