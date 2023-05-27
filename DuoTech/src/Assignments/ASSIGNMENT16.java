package Assignments;
import java.util.Arrays;

public class ASSIGNMENT16 {
    public static void main(String[] args) {
        //Check your output using the tests:
        //TEST 1
        int [] arr1 = {0,1,0,3,12};
        moveZeroes(arr1);
        System.out.println(Arrays.toString(arr1)); //  [1, 3, 12, 0, 0]
        //TEST 2
        int [] arr2 = {0,0,0,0,0,0,1};
        moveZeroes(arr2);
        System.out.println(Arrays.toString(arr2)); //  [1, 0, 0, 0, 0, 0, 0]
        //TEST 3
        int [] arr3 = {12,2,0,0,2,0,0,78,0,12,0};
        moveZeroes(arr3);
        System.out.println(Arrays.toString(arr3)); //  [12, 2, 2, 78, 12, 0, 0, 0, 0, 0, 0]
        //TEST 4
        int [] arr4 = {0};
        moveZeroes(arr4);
        System.out.println(Arrays.toString(arr4)); //  [0]
    }
    public static void moveZeroes(int [] nums){
        int a = 0;
        int b = 0;

        while(b < nums.length){

            if(nums[b] !=0){

                int temp = nums[a];
                nums[a] = nums[b];
                nums[b] = temp;
                a++;
            }
            b++;
        }
    }
}



