package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
//        Stream<Integer> stream = numbers.stream();
//
//        Integer[] nums = {1,2,3,4,5,6,7,8};
//       Stream<Integer> stream1 = Arrays.stream(nums);

        List<Integer> numbers = Arrays.asList(1,2,-3,4,5,-6,7,8,-9,10);

        List<Integer> filtered = numbers.stream()
                .filter(s -> s >= 0)             // any logic can be applied here to get the result I did this for removing negative numbers
                .collect(Collectors.toList());
        System.out.println(filtered);


        List<String> names = new ArrayList<>(Arrays.asList("Alice","Bob","Chris","Charlie","Evan","Gregory"));
        List<String> ch = names.stream()
                .filter(s -> s.contains("Ch"))
                .collect(Collectors.toList());
        System.out.println(ch);

    }
}
