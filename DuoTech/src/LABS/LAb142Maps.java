package LABS;
import java.util.*;

public class LAb142Maps {
    public static void main(String[] args) {

        System.out.println(wordCount(List.of("a", "b", "a", "c", "b")));  // {a=2, b=2, c=1}
        System.out.println(wordCount(List.of("c", "b", "a"))); //  {a=1, b=1, c=1}
        System.out.println(wordCount(List.of("c", "c", "c", "c"))); // {c=4}



    }

    public static Map<String, Integer> wordCount(List<String> list){
        Map<String,Integer> map = new HashMap<>();
        for (String word : list){
            map.put(word, map.getOrDefault(word, 0) +1);
        }
        return map;
    }
}
