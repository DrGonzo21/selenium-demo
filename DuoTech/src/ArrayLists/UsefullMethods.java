package ArrayLists;
import java.util.*;

public class UsefullMethods {

    public static void main(String[] args) {


      List<String> list =  Arrays.asList("Bob","Alice","John");
        // short syntax to create a list;



        List<String> another = List.of("Bob","Alice","John","Samantha");
        // the created list is not modifiable

//        list.add("hfdk");  UnsupportedOperationalException
//        another.add("lkjd"); UnsupportedOperationalException

        //Easy way to create a copy of a list is to use its constructor that creates a copy
       List<Integer> integers =  List.of(1,2,3,4);
       List<Integer> modifiable = new ArrayList<>(integers);
       modifiable.add(43);


       // convert an array into a list

        Integer[] arr = {1,2,3,4};
        List <Integer> list1 = new ArrayList<>(Arrays.asList(arr));
//        List<Integer> list1 = Arrays.asList(arr); // This is doesn't allow the list to be modified but you can pass the array into a list.
        System.out.println(list1);
        list1.add(45);
        System.out.println(arr);

        // convert a list into array


//        Object[] array = nums.toArray();
//        System.out.println(Arrays.toString(array));

























       }
    }

