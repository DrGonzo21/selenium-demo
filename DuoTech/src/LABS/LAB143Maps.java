package LABS;
import java.util.*;

public class LAB143Maps {
    public static void main(String[] args) {
        String[] words = {"c","b","a","b","c"};
        Map<String,Boolean> result = wordMultiple(words);
        result.forEach((word,isMultiple) -> System.out.println(word + " : " + isMultiple));
    }
    public static Map<String, Boolean> wordMultiple(String[] words){
        Map<String, Boolean> result = new HashMap<>();
        for (String word : words){
            result.compute(word, (i,j) -> j == null ? false : true);
        }
        return result;
    }
}
