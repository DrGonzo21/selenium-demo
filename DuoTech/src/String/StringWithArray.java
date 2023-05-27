package String;

import java.util.Arrays;

public class StringWithArray {
    public static void main(String[] args) {
        String str = "Java is Awesome";

        char[]charArray = str.toCharArray();

        System.out.println(Arrays.toString(charArray));
        //Swap first and Last chars of the Array

        char temp = charArray[0];
        charArray[0] = charArray[charArray.length-1];
        charArray[charArray.length-1] = temp;

        System.out.println(Arrays.toString(charArray));
        // convert char[] back to a string

        // use a String constructor

        String str2 = new String(charArray);

        System.out.println(str2);
        // String.vauleOf() -> converts any data type to a String
        // String.vauleOf(34);  //34+""
        String str3 = String.valueOf(charArray);

        System.out.println(str3);




    }
}
