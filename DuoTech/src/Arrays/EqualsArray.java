package Arrays;

import java.util.Arrays;

public class EqualsArray {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "Hello";

        System.out.println(str.equals(str2));

        int [] arr1 = {1,2,3};
        int [] arr2 = {1,2,3};

        System.out.println(arr1);
        System.out.println(arr2);


        System.out.println(arr1.equals(arr2)); // Don't use array's own equals method to compare array content
        // it compares the memory location


        // boolean equals = Arrays.equals(arr1, arr2);

        System.out.println(Arrays.equals(arr1, arr2));
        // To compare array content Arrays.equals(); should be used
    }
}
