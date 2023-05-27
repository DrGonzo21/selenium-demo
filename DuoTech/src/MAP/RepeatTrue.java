package MAP;
import java.util.*;

public class RepeatTrue {

    public static void main(String[] args) {

        String[] words = {"c","b","a","b","c","a"};

        Map<String, Boolean> result = wordMultiple(words);

        result.forEach((word, isMultiple) -> System.out.print(word + " : " + isMultiple + " , "));

    }

    public static Map<String, Boolean> wordMultiple(String[] words){

        Map<String, Boolean> result = new HashMap<>();

        for (String word : words){
            result.compute(word, (i,j) -> j == null ? false : true);
        }
        return result;

    }
}
