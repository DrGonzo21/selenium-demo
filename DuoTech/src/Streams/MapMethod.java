package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethod {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> collect = numbers.stream()
                .map(s -> (s + 5) * 10)         // transforms each element by adding 5 and multipling by 10 (transform method)
                .collect(Collectors.toList());

        System.out.println(collect);
        System.out.println(numbers);



        List<String> names = new ArrayList<>(Arrays.asList("Alice","Bob","Chris","Charlie","Evan","Gregory"));

            List<String> collect1 = names.stream()
                    .map(s ->  (s.substring(1) + s.charAt(0) + "ay").toLowerCase())
                    .collect(Collectors.toList());
                    System.out.println(collect1);

                    collect1.stream().forEach(s -> System.out.println(s.toUpperCase()));
    }
}
