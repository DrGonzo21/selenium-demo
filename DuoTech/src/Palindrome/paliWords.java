package Palindrome;
import java.util.Scanner;

public class
paliWords {
    public static void main(String[] args) {

        String string_to_check="Civic";

        if(isPalindrome(string_to_check)) {
            System.out.println("true");
        }else {
            System.out.println(false);
        }
    }

    public static boolean isPalindrome(String s){
        String reverse="";
        for(int i=s.length()-1;i>=0;i--) {
            reverse = reverse+s.charAt(i);
        }
        if(s.equalsIgnoreCase(reverse)) {
            return true;
        }else {
            return false;
        }
    }

}

