package Lambda;
import java.util.*;
import java.util.stream.*;

public class Vowelfilter {
    public static void main(String[] args) {
        //TESTS

        System.out.println(convertAndFilterVowels(List.of("Hello", "Apple", "world", "Elephant", "stream", "Icecream", "under", "Ant", "Zebra", "Inc", "Umbrella")));  // [apple, elephant, icecream, under, ant, inc, umbrella]
        System.out.println(convertAndFilterVowels(List.of("this", "is", "a", "stream")));  // [is, a]
        System.out.println(convertAndFilterVowels(List.of("No", "vowels", "Here")));  // []

    }


    public static List<String> convertAndFilterVowels(List<String> list){

        return list.stream()
                .map(String::toLowerCase)
                .filter(s -> s.matches("[aeiou].*"))
                .collect(Collectors.toList());
    }
}

