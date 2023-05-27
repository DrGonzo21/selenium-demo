package LABS;
import java.util.*;
import java.util.stream.*;

public class LAB147 {

    public static void main(String[] args) {
        //TESTS

        System.out.println(appendLengthAndFilterOdd(List.of("Hello", "world", "java", "stream", "lambda")));  // ["Hello5", "world5"]
        System.out.println(appendLengthAndFilterOdd(List.of("this", "is", "a", "stream")));  // ["a1"]
        System.out.println(appendLengthAndFilterOdd(List.of("Hello", "Functional", "Programming")));  // ["Hello5", "Programming11"]

    }


    public static List<String> appendLengthAndFilterOdd(List<String> list){

        return list.stream()
                .filter(s -> s.length() % 2 != 0)
                .map(s -> s + s.length())
                .collect(Collectors.toList());
    }
}

