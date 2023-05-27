package Assignments;
import java.util.Arrays;

public class ASSIGNMENT19 {
//    Create a method that takes a 2D array of ints,
//    and swaps the row with the minimum sum with the first row and returns that array.


    public static void main(String[] args) {


        int[][] arr = { {1,2,3},
                {4,5,6},
                {1,0,1}, // row with min sum
        };

        System.out.println(Arrays.deepToString(swapFirstRowWithMinRow(arr)));
    }
    public static int[][] swapFirstRowWithMinRow(int[][] arr){

        int minSum = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
            if (sum < minSum) {
                minSum = sum;
                minIndex = i;
            }
        }

        int[] temp = arr[minIndex];
        arr[minIndex] = arr[0];
        arr[0] = temp;

        return arr;
    }
}


