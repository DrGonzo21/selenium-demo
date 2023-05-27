package ArrayLists;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassDemo {

    public static void main(String[] args) {

        ArrayList<String> names2 =  new ArrayList<>();

        names2.add("Jason");
        names2.add("Alex");
        names2.add("Alex");
        names2.add(0,"Heather");
        names2.add(2,"Shannon");
        names2.add("Alex");

        Collections.sort(names2);
        Collections.reverse(names2);
        System.out.println(Collections.max(names2));
        System.out.println(Collections.min(names2));
        System.out.println(Collections.frequency(names2, "Alex"));




        System.out.println(names2);

        Collections.shuffle(names2);

        System.out.println(names2);

    }
}
