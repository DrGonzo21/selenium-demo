package Arrays;
import java.util.Arrays;


public class SortStringArray {
    public static void main(String[] args) {

        //tests

        System.out.println(sortString("helloworld")); //dehllloorw
        System.out.println(sortString("javascript"));  //aacijprstv
        System.out.println(sortString("algorithm"));  //aghilmort
        System.out.println(sortString("barack"));  //aabckr
        System.out.println(sortString("parviz")); //aiprvz
        System.out.println(sortString("stamlo")); // almost
    }


    public static String sortString(String str){

        char[] chars = str.toCharArray();

        Arrays.sort(chars);

        return new String(chars);
    }
}

// The 'toCharArray()' method is used to convert the string into an array of characters. The
// 'Arrays.sort()' method is used to sort the characters in the array in ascending order.
// Finally, the 'new String()' constructor is used to create a new string from the sorted
// character array.



















