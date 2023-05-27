package LABS;
import java.util.*;
import java.util.stream.*;

public class LAB148 {

    public static void main(String[] args) {
        //TESTS

        System.out.println(cubeAndFilterGreaterThanHundred(List.of(1, 2, 3, 4, 5, 6)));  // [125, 216]
        System.out.println(cubeAndFilterGreaterThanHundred(List.of(7, 8, 9, 10)));  // [343, 512, 729, 1000]
        System.out.println(cubeAndFilterGreaterThanHundred(List.of(11, 12, 13)));  // [1331, 1728, 2197]

    }


    public static List<Integer> cubeAndFilterGreaterThanHundred(List<Integer> list){

        return list.stream()
                .map(s -> s * s * s)
                .filter(s -> s > 100)
                .collect(Collectors.toList());
    }
}

