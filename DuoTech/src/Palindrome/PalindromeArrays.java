package Palindrome;
import java.util.*;

public class PalindromeArrays {
    public static void main(String[] args){
        //Tests
        System.out.println(isPalindrome(new char[] {'d','a','d'}));// true
        System.out.println(isPalindrome(new char[] {'m','o','m'})); //true
        System.out.println(isPalindrome(new char[] {'b','a','d'})); //false
        System.out.println(isPalindrome(new char[] {'c','i','v','i','c'})); //true
        System.out.println(isPalindrome(new char[] {'m','a','d','a','m'})); //true
        System.out.println(isPalindrome(new char[] {'a','d','a','m'})); //false
    }


    public static boolean isPalindrome(char[] arr){

        int size = arr.length;
        char [] original = Arrays.copyOf(arr,arr.length);
        for (int i = 0; i < size / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[size-i-1];
            arr[size-i-1] = temp;
        }
        if(Arrays.equals(arr, original)) {
            return true;
        } else {
            return false;
        }
    }
}
