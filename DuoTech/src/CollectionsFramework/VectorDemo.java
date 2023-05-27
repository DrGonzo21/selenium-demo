package CollectionsFramework;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector<String> animals = new Vector<>();

        //adding elements to the vector
        animals.add("Dog");
        animals.add("cat");
        System.out.println(animals);

        // vector is a thread-safe version of ArrayList and its also slower
        // once the vector is full it doubles its size
    }
}
