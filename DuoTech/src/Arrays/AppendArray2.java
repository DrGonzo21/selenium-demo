package Arrays;

import java.util.Arrays;

public class AppendArray2 {
    public static void main(String[] args) {

        //TESTS
        System.out.println(Arrays.toString(append(new int[] {1,2,3,4,5,6}, new int[] {9,2,1}))); //-> {1,2,3,4,5,6,9,2,1}
        System.out.println(Arrays.toString(append(new int[] {1,3,3,3}, new int[] {23,89,22,55,90,100}))); // -> {1,3,3,3,23,89,22,55,90,100}
        System.out.println(Arrays.toString(append(new int[] {9,45,0,1,23,89,22,55}, new int[] {-3,-2,-1, 0})));// -> {9,45,0,1,23,89,22,55,-3,-2,-1, 0}
        System.out.println(Arrays.toString(append(new int[] {5}, new int[] {6}))); // -> {5,6}
}
    public static int[] append(int[] arr1, int[] arr2){

            int[] result = new int[arr1.length + arr2.length];

            int index = 0;
        for (int i = 0; i <arr1.length; i++) {
            result [index] = arr1[i];
            index++;

        }
        for (int j = 0; j < arr2.length; j++) {
            result[index] = arr2[j];
            index++;
        }
        return result;

        }

        }

