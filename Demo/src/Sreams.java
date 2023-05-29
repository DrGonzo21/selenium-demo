import java.util.*;
import java.util.Map;

public class Sreams {

    public static void main(String[] args) {


        //TESTS
        System.out.println(wordLen(List.of("a", "bb", "a", "bb")));  // {bb=2, a=1}
        System.out.println(wordLen(List.of("this", "and", "that", "and"))); //  {that=4, and=3, this=4}
        System.out.println(wordLen(List.of("code", "code", "code", "bug"))); // {code=4, bug=3}


    }
    public static Map<String, Integer> wordLen(List<String> words){
        
        Map<String, Integer> stringLengthMap = new HashMap<>();

        words.forEach(str -> stringLengthMap.putIfAbsent(str, str.length()));

        return stringLengthMap;

    }
}
