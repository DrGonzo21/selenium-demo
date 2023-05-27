package String;

import java.util.Arrays;

public class SplitStringArray {
    public static void main(String[] args) {
        String str = "Talk is cheap. Show me the code";
        String[] arr = str.split(" "); // splits the string into an string[] where each element is a String by given char
       // System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
