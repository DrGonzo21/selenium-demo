package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AggregateMethod {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(1,2,-3,4,5,-6,7,8,-9,10);

        int sum = numbers.stream()
                .mapToInt(Integer :: intValue).sum();
        System.out.println(sum);


        List<String> names = new ArrayList<>(Arrays.asList("alice","Bob","chris","Charlie","evan","gregory"));

       List<String> collect = names.stream()
                .filter(s -> Character.isLowerCase(s.charAt(0)))
               .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1))
                .collect(Collectors.toList());
        System.out.println(collect);


        List<String> names1 = new ArrayList<>(Arrays.asList("alice","bob","chris","charlie","evan","gregory"));

        List<Integer> collect1 = names1.stream()
                .filter(s -> s.startsWith("c") || s.endsWith("e"))
                .map(String::length)
//                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(collect1);

        // keep all string that start with c or end with e
        // return a collection with those strings length


        Integer[] nums = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> collect2 = Arrays.stream(nums)
                .filter(s -> s % 2 != 0)
                .map( s -> (int) Math.pow(s,5))
                .toList();

       Integer[] array = collect2.toArray(Integer[]::new); // convert list to an array

        System.out.println(Arrays.toString(array));
    }
}
