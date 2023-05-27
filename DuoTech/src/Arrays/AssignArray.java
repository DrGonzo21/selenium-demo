package Arrays;

import java.util.Arrays;

public class AssignArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        int [] arr2 = new int [6];
        arr = arr2; // assign arr2's pointer to arr
            // after the assignment arr will point to whatever arr2 is pointing to
        System.out.println(Arrays.toString(arr));
    }
}
