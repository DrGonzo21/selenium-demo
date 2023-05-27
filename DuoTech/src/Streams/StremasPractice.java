package Streams;
import java.util.stream.*;
import java.util.*;

public class StremasPractice {

    public static void main(String[] args) {

        List<String> inputList = Arrays.asList("fox", "Elephant", "Dog", "cat", "Mouse", "bat", "Eagle", "shark", "fox",
                "fox", "elk", "elk", "cat", "Ant");

        List<String> outputList = filterMapSort(inputList);
        System.out.println(outputList);
    }


    public static List<String> filterMapSort(List<String> list) {


        return list.stream()
                .filter(str -> str.length() == 3 && !str.contains("e"))
                .map(str -> new StringBuilder(str).reverse().toString().toUpperCase())
                .distinct()
                .sorted()
                .collect(Collectors.toList());

    }
}
