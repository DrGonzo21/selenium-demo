package Palidrome;
import java.util.Scanner;

public class Pali {
    public static void main(String[] args) {
        String string_to_check = "Civic";
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



