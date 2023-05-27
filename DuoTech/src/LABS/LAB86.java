package LABS;
import java.util.Arrays;

public class LAB86 {
    public static void main(String[] args) {
        swapValues(new double[] {2.5, 5.0}); // -> [5.0, 2.5]
        swapValues(new double[] {0.0, 1.0}); //  -> [1.0, 0.0]
        swapValues(new double[] {99, 9}); // -> [9.0, 99.0]
        swapValues(new double[] {10.1, 19.3}); // -> [19.3, 10.1]
    }
    public static void swapValues(double [] arr){

        double temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        System.out.println(Arrays.toString(arr));
    }

}



