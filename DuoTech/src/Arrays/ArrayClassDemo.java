package Arrays;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class ArrayClassDemo {
    public static void main(String[] args) {


        // Java has 2 types: Primitive and referencce types
        // reference types : class, array, enum, interface, record, annotation

        int[] arr = {69,1080,5,10,3};

        // array as a type doesn't have built in methods
        // Arrays - utility class that helps performs common array operations
        // All methods in an  Array class are static

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // Faster then bubble sorting

//        int[] arr2 = {2,0,4,2,6,0,1,1,3};
//
//        Arrays.sort(arr, 0,6);
//        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {69,1080,5,10,3};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.binarySearch(arr3, 5));
        // if the element is not found returns -(insertion index+1)

//        isSorted(arr2);
    }
//    public boolean isSorted(int [] arr) {



    }


