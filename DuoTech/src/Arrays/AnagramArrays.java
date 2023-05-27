package Arrays;

import java.util.Arrays;

public class AnagramArrays {
    public static void main(String[] args) {

        //TESTS
        System.out.println(isAnagram("abca", "caba")); // true
        System.out.println(isAnagram("abc", "abb")); // false
        System.out.println(isAnagram("night", "thing")); // true
        System.out.println(isAnagram("cola", "loco")); // false

    }


    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr2);

        return Arrays.equals(arr, arr2);
    }
}

