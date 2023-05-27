package Arrays;

import java.util.Arrays;

public class ArrayClass2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,2,3,432,4,3,32,32,32,342};

        int sum = 0;

        for (int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }
        System.out.println("the total is: " + sum);

        //to get the true average you must convert the int to a double by (*1.0)
        System.out.println("the average is: "+ sum*1.0/nums.length);

        // default vaule for a double is 0.o
        System.out.println(Arrays.toString(new double[3]));

        //since boolean only has 2 vaules; it will print false (x) times
        System.out.println(Arrays.toString(new boolean[4]));

        // all object types get null as a deafult vaule unless you assign a vaule to it
        System.out.println(Arrays.toString(new String[3]));

    }
}
