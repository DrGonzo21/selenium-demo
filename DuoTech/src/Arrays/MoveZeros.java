package Arrays;
import java.util.Arrays;

public class MoveZeros {

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
            int left = 0;
            int right = 0;
            while (right < nums.length) {
                if (nums[right] != 0) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    left++;
                }
                right++;
            }
        }
        }

  //  One way to solve this problem is to use a two-pointer approach. We can maintain a pointer
// "left" that points to the first zero element and another pointer "right" that points to the first
// non-zero element after "left". We can then swap the elements at "left" and "right" and move
// "left" to the next zero element and "right" to the next non-zero element. We can repeat this
// process until "right" reaches the end of the array.
