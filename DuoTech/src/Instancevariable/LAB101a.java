package Instancevariable;

public class LAB101a {
    public static void main(String[] args) {
        LAB101b ava = new LAB101b();

        // Call the add method to add numbers to the sum
        ava.add(10);
        ava.add(20);
        ava.add(30);

        // Call the getSum method to get the sum of the numbers
        int sum = ava.getSum();
        System.out.println("Sum: " + sum);

        // Call the getCount method to get the count of numbers added
        int count = ava.getCount();
        System.out.println("Count: " + count);

        // Call the getAverage method to get the average of the numbers
        double average = ava.getAverage();
        System.out.println("Average: " + average);
    }
}
