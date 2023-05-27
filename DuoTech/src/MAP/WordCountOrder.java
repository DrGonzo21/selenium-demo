package MAP;
import java.util.*;

public class WordCountOrder {

    public static void main(String[] args) {


        System.out.println(wordCount("I would like to go to the park and I would like to play soccer"));//  {I=2, would=2, like=2, to=3, go=1, the=1, park=1, and=1, play=1, soccer=1 }
        System.out.println(wordCount("I you him you them you I her her her I")); //{I=2, you=3, him=1, them=1, her=3}
    }
    public static Map<String,Integer> wordCount(String sentence){

        Map<String,Integer> result = new TreeMap<>();

        String[] word = sentence.split(" ");

        for (String map : word){

            result.put(map, result.getOrDefault( map, 0) + 1);
        }
        return result;
    }

}
