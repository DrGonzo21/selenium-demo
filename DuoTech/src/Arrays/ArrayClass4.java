package Arrays;

import java.util.Arrays;

public class ArrayClass4 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,7,8,12,0};

        //Find the max

        // Start as the first vaule of the array as max


        int max = arr[0];
        int indexOfMax = 0;

        for (int i = 0; i<arr.length-1; i++){
            if (arr[i]>max) {  // to find mim. simply replace > with <
                max = arr[i]; // update the max
                indexOfMax = i; // update the indexOfMax
            }
            }
            System.out.println("The max is: " + max + " at index: " + indexOfMax);

    }
}
