package ClassTask;
import java.util.*;

public class CLASSTASK073 {


    public static void main(String[] args) {


        System.out.println(wordCount("I would like to go to the park and I would like to play soccer"));//  {I=2, would=2, like=2, to=3, go=1, the=1, park=1, and=1, play=1, soccer=1 }
        System.out.println(wordCount("I you him you them you I her her her I. I love Java. Java is awesome, and easy to learn; However, it requires a consistent Practice.practice."));

    }

    public static Map<String, Integer> wordCount(String sentence) {


        Map<String, Integer> wordcount = new TreeMap<>();

        String[] word = sentence.toLowerCase().split("[ ,.;]");

        for (String each : word) {

            if(!each.isEmpty())
            wordcount.put(each, wordcount.getOrDefault(each, 0) + 1);
        }
        return wordcount;
    }

}
