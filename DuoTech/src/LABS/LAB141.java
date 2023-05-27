package LABS;
import java.util.*;
import java.util.stream.Collectors;

public class LAB141 {
    public static void main(String[] args) {

        System.out.println(square(new ArrayList<>(Arrays.asList(1, 2, 3)))); //[1, 4, 9]
        System.out.println(square(new ArrayList<>(Arrays.asList(6, 8, -6, -8, 1)))); //[36, 64, 36, 64, 1]
        System.out.println(square(new ArrayList<>(Arrays.asList()))); //[]
    }

    public static List<Integer> square(List<Integer> list) {
        return list.stream()
                .map(s -> s * s)
                .collect(Collectors.toList());
    }
}

