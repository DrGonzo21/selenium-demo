package String;

import java.util.Arrays;

public class ReverseStringWithArray {

    public static void main(String[] args) {

    }
    public static String reverse(String str){


        String str1 = "Hello";
        String reversed = "";

        for (int i =  str1.length()-1; i>=0;i--) {

            reversed = reversed + str.charAt(i);
        }
        return reversed;
    }
}
