package LABS;

import java.util.ArrayList;
import java.util.List;

public class LAB145 {
    //    Given a list of strings, return a list where each string is reversed and only those strings which have length greater than 5 are included.


    public static void main(String[] args) {
        //TESTS

        System.out.println(reverseAndFilterFive(List.of("hello", "world", "java", "stream", "lambda")));  // [ "maerts", "adbmal"]
        System.out.println(reverseAndFilterFive(List.of("this", "is", "a", "world")));  // []
        System.out.println(reverseAndFilterFive(List.of("streaming", "in", "java")));  // ["gnimaerts"]

    }


    public static List<String> reverseAndFilterFive(List<String> list){


        List<String> result = new ArrayList<>();

        for (String s : list){

            if(s.length() > 5){
                StringBuilder reversed = new StringBuilder(s);
                result.add(reversed.reverse().toString());
            }
        }
        return result;
    }
}


