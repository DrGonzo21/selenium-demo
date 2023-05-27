package Arrays;

import java.util.Arrays;

public class MethodwithArray {
    public static void main(String[] args) {

        String[] greetings = new String[]{"hi", "hello", "auf wiedersehen", "hola"};
        int[] eachElementLength = getEachElementLength(greetings);
        System.out.println(Arrays.toString(eachElementLength));

        //Create a method that takes a String array and returns an int array where each vaule represents a String:
        //getEachElementLength(new String[] {"hi", "hello"}) -> {2,5}
        // Method takes array and returns a another array,
    }

    public static int[] getEachElementLength(String[] StrArr) {

        int[] intArr = new int[StrArr.length]; // create a array with the same size as the passed array

        for (int i = 0; i < StrArr.length; i++) {
            intArr[i] = StrArr[i].length();

        }
        return intArr;
    }

    public static String [] getEachUppercased(String[] StrArr) {
        for (int i = 0; i < StrArr.length; i++) {
            StrArr[i] = StrArr[i].toUpperCase();


        }
        return StrArr;
    }
}

