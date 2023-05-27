package MAP;
import java.util.*;

public class Occurance {

    public static void main(String[] args) {

        String nums = "1 2 3 4 1 5 3 2 ";
        Occurances(nums);
    }
    public static void Occurances(String nums){

        Map<Integer,Integer> Map = new HashMap<>();

        for (String numb : nums.split(" ")){
            int number = Integer.parseInt(numb);
            Map.put(number,Map.getOrDefault(number,0) + 1);
        }
        Map.forEach((number, Occurance) -> System.out.println(number + ":" + Occurance));
    }
}
