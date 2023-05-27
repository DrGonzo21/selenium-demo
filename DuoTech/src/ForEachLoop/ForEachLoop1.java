package ForEachLoop;

import java.util.Arrays;

public class ForEachLoop1 {
    public static void main(String[] args) {
        // For each loop was added in JDK 5

        int [] arr = {1,2,3,4,5,6,};

        for (int element : arr){   // call the element -> choose the array
            System.out.println(element);

            String[] names = {"Bobby", "Jerrod", "Anastacia"};
            for (String name : names){
                System.out.println(name.toUpperCase());

                // For each advantages :
                // No need for index
                //more readable
                // Less code
                // Error prone, you never get an out of bounds error

                // For each disadvantages:
                // whenever you need an index: partial traversal (from the middle till the end)
                // cannot reverse the iteration
                // when you need to modify the array while iterating, for each loop shouldn't be used since it cant be modified
                // Don't use for each loop to update/modify collection of elements that require a index
                // for each loop is a read only loop
                // short cut for " for each loop"  -> iter



               int[] arr2 = {4,5,6,7,8,9};
                for (int i = 0; i < arr2.length; i++) {
                    arr2[i] = arr2[i]*10;



                }
                System.out.println(Arrays.toString(arr2));
                }


            }
        }

    }

