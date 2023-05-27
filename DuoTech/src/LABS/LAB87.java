package LABS;
import java.util.Arrays;

public class LAB87 {
    public static void main(String[] args) {
        //TESTS
        reverse(new char[] {'a', 'b', 'c'}); //-> [c, b, a]
        reverse(new char[] {'c', 'i', 'v', 'i', 'c'}); // -> [c, i, v, i, c]
        reverse(new char[] {'j', 'a', 'v', 'a'}); // -> [a, v, a, j]
        reverse(new char[] {'y', 'o'}); //  -> [o, y]
        reverse(new char[] {'o'}); // -> [o]
    }
    public static void reverse(char[] arr){
        int i = 0;
        int j = arr.length-1;

        while(i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));


    }
}
// The 'reverse()' method takes a char array, reverses its element values using a two-pointer approach,
// and prints out the content of the reversed array using 'Arrays.toString()' method.

// Note: that the function works for char arrays of any size, including those with a single element.


