package LABS;
import java.util.*;

public class LAB141Maps {


    public static void main(String[] args) {


        //TESTS
        System.out.println(wordLen(List.of("a", "bb", "a", "bb")));  // {bb=2, a=1}
        System.out.println(wordLen(List.of("this", "and", "that", "and"))); //  {that=4, and=3, this=4}
        System.out.println(wordLen(List.of("code", "code", "code", "bug"))); // {code=4, bug=3}


    }


    public static Map<String, Integer> wordLen(List<String> words){

    Map<String,Integer> strlength = new HashMap<>();
    words.forEach(s -> strlength.putIfAbsent(s, s.length()));
    return strlength;
}
}
