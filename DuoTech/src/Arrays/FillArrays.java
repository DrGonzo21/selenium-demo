package Arrays;

import java.util.Arrays;

public class FillArrays {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};

//        Arrays.fill(arr,88);

//        Arrays.fill(arr, 4,7, 88);

        Arrays.fill(arr, arr.length-5,arr.length, 88);

        int[] ints =Arrays.copyOf(arr, arr.length);

        System.out.println(Arrays.toString(ints));

//        System.out.println(Arrays.toString(arr));
    }
}
