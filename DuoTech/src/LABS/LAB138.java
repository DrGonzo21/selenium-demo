package LABS;
import java.util.*;

public class LAB138 {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(11,200,43,84,9917,4321,1,33333,8997);
        Integer Largest = findLargest(num);
        System.out.println(Largest);

        num = Arrays.asList(987, 1234, 9381, 731, 43718, 8932);
        Integer Largest1 = findLargest(num);
        System.out.println(Largest1);

        num = Arrays.asList(34070, 1380, 81238, 7782, 234, 64362, 627);
        Integer Largest2 = findLargest(num);
        System.out.println(Largest2);
}

public static Integer findLargest(List<Integer> integerList){
        Integer Largest = Collections.max(integerList);
        return Largest;
    }
}
