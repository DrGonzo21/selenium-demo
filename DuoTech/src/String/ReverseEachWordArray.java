package String;

import java.util.Arrays;

public class ReverseEachWordArray {
    public static void main(String[] args) {

        // Java is easy -> avaJ si ysae

        String str = "Java is easy";
        String str2 = "";

        String[] arr = str.split(" ");



        for (int i = 0; i < arr.length; i++) {
            str2 = arr[i];
            System.out.println(str2);


        }

    }
}
