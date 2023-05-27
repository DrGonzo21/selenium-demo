package Arrays;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        // Given a 2D array of ints, find the row with the largest sum

        int[][] arr  = {{73, 32, 15, 16}, // 136
                {30, 51, 87, 15}, // 183
                {35, 61, 78, 49}, // 217
                {85, 67, 64, 89}, // 305
                {27, 1, 96, 56}}; // 180


        // Expected output: Th row with the the largest sum is located at index 3

        // 1. Get the sum of the first row and assume it as the row by assigning it to a maxRow variable.
        //.2. Use nested loops to get the sum of other rows and  check if the sum of that row is larger than maxRow
        // if it is, update the maxRow.

        int largestsum = 0;
         int maxrow = 0;

        for(int i = 0; i < arr[0].length; i++){
            largestsum += arr[0][i];
        }

        int sumofcurrent = 0;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j< arr[i].length; j++){
                sumofcurrent += arr[i][j];
            }
            if (sumofcurrent > largestsum){
                largestsum = sumofcurrent;
                maxrow = i;
            }
            System.out.println("Sum of rows " + i + ": " + sumofcurrent);
            sumofcurrent = 0;
        }
        System.out.println("Max row " + maxrow);
    }

}