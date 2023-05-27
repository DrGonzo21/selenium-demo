package LABS;
import java.util.*;
import java.util.stream.*;

public class LAB149 {

    public static void main(String[] args) {
        //TESTS

        System.out.println(sortAndFilterEven(List.of("13", "24", "8", "19", "21", "16")));  // [8, 16, 24]
        System.out.println(sortAndFilterEven(List.of("27", "44", "32", "5", "16")));  // [16, 32, 44]
        System.out.println(sortAndFilterEven(List.of("3", "11", "23", "7")));  // []

    }


    public static List<Integer> sortAndFilterEven(List<String> list){

        return list.stream()
                .map(Integer::parseInt)
                .sorted()
                .filter(s -> s % 2 == 0)
                .collect(Collectors.toList());
    }
}

