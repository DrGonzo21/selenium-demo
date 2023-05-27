package Arrays;
import java.util.*;

public class SinglePassArray {

    public static void main(String[] args) {

        //TESTS

        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1})); //true
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4})); //false
        System.out.println(containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2})); // true
        System.out.println(containsDuplicate(new int[]{1})); //false
        System.out.println(containsDuplicate(new int[]{})); //false
        System.out.println(containsDuplicate(new int[]{1, 3, 5, 7, 9, 11, 13, 11, 15})); // true


    }

    public static boolean containsDuplicate(int[] nums) {

        Set set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true; // duplicate found
            }
        }
        return false; // no duplicate found
    }
}
