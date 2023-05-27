package Arrays;
import java.util.Arrays;
import java.util.Random;

public class RaggedArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        System.out.println(Arrays.deepToString(arr));
        arr[0] = new int[2];
        System.out.println(Arrays.deepToString(arr));
        arr[1] = new int[]{1,2,3};
        System.out.println(Arrays.deepToString(arr));
        arr[2] = new int[]{1,2,3,4,};
        System.out.println(Arrays.deepToString(arr));

        for (int i = 0; i < arr.length; i++){
//            arr[i] = new int[]{2,2,2};  // replaces the columns with whats in the {}
            arr[i] = new int[7];  // replaces whats in the column with 7 0's
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
