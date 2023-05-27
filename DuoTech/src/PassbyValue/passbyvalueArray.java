package PassbyValue;
import java.util.Arrays;


public class passbyvalueArray {
    public static void main(String[] args) {

        //for mutable objects (like arrays), pass-by-value works by passing the copy of the reference
        // if the method changes the object using the reference in the method, the calling method will see the change
        //both calling method and other methods reference are pointing to the same object

        int[] nums = {1,2,3};

        changeArrayByMultiplyingEachBy10(nums);

        System.out.println(Arrays.toString(nums));

    }
    public static void changeArrayByMultiplyingEachBy10(int[] arr){


    for(int i = 0; i< arr.length; i++){
        arr[i] = arr[i] *10;
    }
}
}
