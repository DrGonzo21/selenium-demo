package LABS;
import java.util.*;
import java.util.stream.Collectors;

public class LAB142 {
    public static void main(String[] args) {
        //TESTS
        System.out.println(math(new ArrayList<>(Arrays.asList(1, 2, 3)))); //[20, 30, 40]
        System.out.println(math(new ArrayList<>(Arrays.asList(6, 8, 6, 8, 1)))); //[70, 90, 70, 90, 20]
        System.out.println(math(new ArrayList<>(Arrays.asList(10)))); //[110]
    }


    public static List<Integer> math(List<Integer> list){

        return list.stream()
                .map(s -> (s + 1) * 10)
                .collect(Collectors.toList());
    }
}

