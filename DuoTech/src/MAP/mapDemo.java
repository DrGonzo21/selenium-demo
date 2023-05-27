package MAP;

import java.awt.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class mapDemo {

    public static void main(String[] args) {


        // Map interface does not extend Collection interface


        // students 23 = Name
        Map<Integer,String> students = new HashMap<>(); // hashmap does not keep the insertion order

        students.put(23,"Jerrod");
        students.put(12,"Alina");
        students.put(11,"Kamran");
        students.put(10,"Zina");
        students.put(2,"Anna");


        System.out.println(students);

        System.out.println(students.get(23).toUpperCase()); // get method in Map requires key and returns the corresponding value for the key

      //  System.out.println(students.get(0)); // will return null if the key doesn't exist in this map

        students.put(23,"Anastacia"); // adding a key with a new value will replace the old value
        System.out.println(students);
        students.put(null,"jerrod"); // null key is allowed in hashmap
        System.out.println(students);
        System.out.println(students.size());
        Set<Integer> keys = students.keySet(); // returns all keys of the map
        System.out.println(keys);

//        System.out.println(keys.getClass());

        Collection<String> values = students.values(); // returns all the values of the map as a generic collection

        //List list = (List<string>) values; // you can cast Collection to a specific collection by down casting

//        students.clear();
        System.out.println(students);

        if(!students.containsKey(11)) {  // only adds if the key hasn't been used yet
            students.put(11, "Alina");
        }

        System.out.println(students.containsValue("jerrod"));
        System.out.println(students);

        students.remove(null);
        System.out.println(students);
        System.out.println(students.size());
    }
}
