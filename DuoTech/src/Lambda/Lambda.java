import java.util.List;
import java.util.*;

public class Lambda {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Alice","Bob","Charlie","Chris","Evan","Gregory")); // create a modifiable list
//        List<String> names = new ArrayList<>(List.of("Alice","Bob","Charlie","Chris","Evan","Gregory"));  either way works

        names.forEach(name -> { name = name.toLowerCase(); System.out.println(name);}); // do something for each item of the collection
        System.out.println(names);

        names.forEach(System.out::println);  // method reference

                int[] arrs = {1,2,3,4,5};
                Arrays.stream(arrs).forEach(s -> System.out.println(s));

                names.removeIf(s -> s.startsWith("C")); //removes everything that starts with "C"
//                names.removeIf(s -> !s.startsWith("C")); removes everything that doesnt start with "C"
                System.out.println(names);

                List<Integer> nums = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
                nums.removeIf(s -> s % 2 == 0); // removes even
                System.out.println(nums);

                List<String> another = new ArrayList<>(List.of("Alice","Bob","Charlie","Chris","Evan","Gregory"));

                another.sort(String::compareTo); //Comparator method
        //        another.sort(s1,s2) -> s1.compareTo(s2));


        List<Integer> nums1 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        nums1.removeIf(s -> s % 2 != 0);
        nums1.replaceAll(s -> s * s * s);
//        nums1.sort((s1,s2) -> s2 - s1);
//        nums1.sort(Comparator.naturalOrder()); // sort by ascending
        nums1.sort(Comparator.reverseOrder()); // sort by descending
       nums1.forEach(System.out::println);



    }
}


