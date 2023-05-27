package Arrays;
import java.util.*;


public class ArraysAss {
    public static void main(String[] args) {
        int[] arr = new int[30];
        int count = 0;

        for (int i = 0; i < arr.length; i++){

            arr[i] = (int)(Math.random()*25);
            if (arr[i]==11){
                count++;
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
}
