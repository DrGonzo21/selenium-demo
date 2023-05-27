package Assignments;
import java.util.*;

public class ASS27 {

    public static void main(String[] args) {

        String input = "1 2 3 4 5 6 7 8 6 5 4 2 4 9";
        Dup(input);
    }

    public static void Dup(String num){

        Map<Integer, Integer> Map = new HashMap<>();

        for (String number : num.split(" ")){
            int numbs = Integer.parseInt(number);
            Map.put(numbs, Map.getOrDefault(numbs, 0) + 1);
        }
        Map.forEach((number,Dup) -> System.out.println(number + ":" + Dup));
    }
}
