package LABS;
import java.util.*;
import java.util.stream.*;

public class LAB150 {

    public static void main(String[] args) {
        //TESTS

        System.out.println(filterAndSort(List.of("abc", "Abc", "a1b", "bca", "AAA", "aab", "a", "abcde", "AAB")));  // [abc, aab, Abc, AAB, AAA]

    }


    public static List<String> filterAndSort(List<String> list){

        return list.stream()
                .filter(s -> s.matches("^[aA][a-zA-Z]{2}$"))
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());


    }
}

