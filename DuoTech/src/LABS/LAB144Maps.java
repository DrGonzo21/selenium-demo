package LABS;
import java.util.*;

public class LAB144Maps {

    public static void main(String[] args) {

        String[] strings = {"man", "moon", "good", "night"};

        Map<String, String> resultMap = pairs(strings);

        resultMap.forEach((firstChar, lastChar) -> System.out.println(firstChar + " : " + lastChar));
    }
    public static Map<String, String>  pairs(String[] words){

        Map<String, String> result = new HashMap<>();

        for(String s : words){
            result.put(String.valueOf(s.charAt(0)),String.valueOf(s.charAt(s.length() - 1)));
        }
        return result;
    }
}
