package Arrays;
import java.util.*;

public class ArrayFindMin {
    public static void main(String[] args){

        int[] arr = new int[10];
        int min = arr.length-1;
        int index = 0;

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*25);
            System.out.print(" "+ arr[i]);


            if (arr[i]<min) {
                min = arr[i];
                index = i;
            }

        }
        System.out.println(" The min is: " + min + " at index: " + index);

    }
}



