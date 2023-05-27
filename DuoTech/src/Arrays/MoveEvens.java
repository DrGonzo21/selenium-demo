package Arrays;
import java.util.*;

public class MoveEvens {
    public static void main(String[] args) {


        //TEST1
        int[] arr1 = {1, 0, 1, 0, 0, 1, 1};
        moveEvensToFront(arr1);
        System.out.println(Arrays.toString(arr1)); // [0, 0, 0, 1, 1, 1, 1]

// TEST2
        int[] arr2 = {3, 3, 2};
        moveEvensToFront(arr2);
        System.out.println(Arrays.toString(arr2)); // [2,3,3]



    }




    public static void moveEvensToFront(int[] arr){


        for (int i = 0; i<arr.length; i++){

            for(int j = i+1; j<arr.length; j++){

                if( arr[j]%2 == 0){ // if you put arr[i] -> it will put the odds first

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;



                }
            }
        }
    }
}

