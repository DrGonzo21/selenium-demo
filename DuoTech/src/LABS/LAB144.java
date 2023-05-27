package LABS;
import java.util.*;
import java.util.stream.*;

public class LAB144 {


    public static void main(String[] args) {
        //TESTS

        System.out.println(squareAndFilterEven(List.of(1, 2, 3, 4)));  // [1, 9]
        System.out.println(squareAndFilterEven(List.of(5, 6, 7, 8)));  // [25, 49]
        System.out.println(squareAndFilterEven(List.of(2, 4, 6)));  // []

    }


    public static List<Integer> squareAndFilterEven(List<Integer> list){

    return list.stream()
            .filter(s -> s % 2 != 0)
            .map(s -> s * s)
            .collect(Collectors.toList());
}
}
