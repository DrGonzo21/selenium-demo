package ArrayLists;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListUsefulMethods {


    public static void main(String[] args) {


        List<String> list = Arrays.asList("Bob", "Alice", "John");
        // Short syntax to create a list;
        List<String> another = List.of("Bob", "Alice", "John", "Samantha");

        // The lists created that way are not modifiable, they throw exception if you try to modify them

//        list.add("cdsvgh"); // UnsupportedOperationException
//        another.add("cdsvgh"); // UnsupportedOperationException

        List<Integer> integers = List.of(1, 2, 3, 4);

        // Easy way to create a copy of a list is to use its constructor that creates a copy
        List<Integer> modifieableVersion = new ArrayList<>(integers);
        modifieableVersion.add(43);


        // convert an array into a list

        Integer[] arr = {1,2,4};

        List<Integer> list1 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list1);
        list1.add(23);

        System.out.println(list1);

        // convert a list into an array

        List<Integer> nums = Arrays.asList(1,2,3);

        Object[] array = nums.toArray();

        System.out.println(Arrays.toString(array));






    }

}