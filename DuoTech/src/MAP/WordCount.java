package MAP;
import java.util.*;

public class WordCount {

    public static void main(String[] args) {

        System.out.println(wordCount(List.of("a", "b", "a", "c", "b")));  // {a=2, b=2, c=1}
        System.out.println(wordCount(List.of("c", "b", "a"))); //  {a=1, b=1, c=1}
        System.out.println(wordCount(List.of("c", "c", "c", "c"))); // {c=4}



    }

    public static Map<String, Integer> wordCount(List<String> list){
        Map<String, Integer> word = new HashMap<>();
        for (String map : list){
            word.put(map,word.getOrDefault(map,0) +1);
        }
        return word;
    }
}
