package Arrays;
import java.util.Random;


import java.util.Arrays;

public class TDArray {

            public static void main(String[] args) {
                int[][] arr = new int[7][9];
                Random rand = new Random();

                // Fill the array with random numbers
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        arr[i][j] = rand.nextInt(25) + 1;
                    }
                }

                // Find the largest value and its index
                int largest = arr[0][0];
                int row = 0;
                int col = 0;
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        if (arr[i][j] > largest) {
                            largest = arr[i][j];
                            row = i;
                            col = j;
                        }
                    }
                }

                // Print the array and the index of the largest value
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("The largest value is " + largest + " and it is in index arr[" + row + "][" + col + "]");
            }
        }







