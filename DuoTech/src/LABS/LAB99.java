package LABS;

import java.util.Arrays;
import java.util.*;

public class LAB99 {

//    Create 2 overloaded methods called getAverage:
//     1. accepts an integer array and returns the average of its all values
//    {3,2,5,1,6} -> 3  (17/5)
//      2. accepts a double array and returns the average of its all values
//    {2.3 ,6.1 , 9.1 , 2.9} -> 5.1

        public static void main(String[] args) {
            //Test your methods by passing the given arrays
            int[] arr1 = {3,2,5,1,6};
            double [] arr2 = {2.3 ,6.1 , 9.1 , 2.9};

            int avg1 = average(arr1);
            double avg2 = average(arr2);

            System.out.println("Average of arr1: " + avg1);
            System.out.println("Average of arr2: " + avg2);


        }

        public static int average(int[] arr){
            return (int) Arrays.stream(arr).average().orElse(0);
        }
        public static  double average(double[] arr){
            return(double) Arrays.stream(arr).average().orElse(0.0);
        }

    }




