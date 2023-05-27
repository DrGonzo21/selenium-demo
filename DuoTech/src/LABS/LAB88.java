package LABS;
import java.util.Arrays;

public class LAB88 {
    public static void main(String[] args) {

        //TESTS
        System.out.println(Arrays.toString(doubleEach(new int[] {11, -4, 0, 777}))); //-> {11, 11, -4, -4, 0, 0, 777, 777}
        System.out.println(Arrays.toString(doubleEach(new int[] {1,2,3,4,5})));// -> {1,1,2,2,3,3,4,4,5,5}
        System.out.println(Arrays.toString(doubleEach(new int[] {100,2,9,-1})));// -> {100,100,2,2,9,9,-1,-1}
        System.out.println(Arrays.toString(doubleEach(new int[] {5})));// -> {5,5}

    }


    public static int[] doubleEach(int[] arr){

        int[] result = new int[arr.length * 2];

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            result[index++] = arr[i];
            result[index++] = arr[i];
        }

        return result;
    }
}


