package Arrays;
import java.util.Arrays;

public class TDArrayLarge {
    public static void main(String[] args) {
        int[][] arr = new int[7][9];

        //generate random, rumber for each element
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int)(1+ Math.random()*25);

            }
        }
        System.out.println(Arrays.deepToString(arr));

        //find the largest element

        int row = 0;
        int column= 0;
        int maxValue = arr[0][0];
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                if (arr[i][j]>maxValue){
                    maxValue = arr[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        System.out.println("Max is " + maxValue);
        System.out.println(" Row " + row + " Column " + column);
    }
}
