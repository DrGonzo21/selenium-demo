package LABS;
import java.util.Arrays;

public class LAB92 {
    public static void main(String[] args) {

        //TESTS
        System.out.println(Arrays.toString(rotateRight(new int[] {3, 8, 19, 7}))); //-> {7, 3, 8, 19}
        System.out.println(Arrays.toString(rotateRight(new int[] {1,2,3,4,5,6}))); //-> {6,1,2,3,4,5}
        System.out.println(Arrays.toString(rotateRight(new int[] {1,3,2}))); //-> {2,1,3}
        System.out.println(Arrays.toString(rotateRight(new int[] {9,45,0,1,23,89,22,55}))); //-> {55,9,45,0,1,23,89,22}



    }


    public static int[] rotateRight(int[] arr){

        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {

            arr[i] = arr[i - 1];
        }

        arr[0] = last;

        return arr;
    }
}
