package String;

import java.util.Arrays;

public class ReverseSentenceArray {
    public static void main(String[] args) {
        String str = "Java is easy and fun "; //fun and easy is Java
        String newsentence = "";
       String[] arr = str.split(" ");
       for (int i =  arr.length-1 ; i >= 0; i--) {
           newsentence += arr[i] + " ";
       }
       System.out.println(newsentence.trim());

        for (int i = 0, j = arr.length-1; i<j; i++, j--){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
        System.out.println(Arrays.toString(arr));
         String sentence = String.join(" ",arr);
        System.out.println(sentence);

        }
    }

