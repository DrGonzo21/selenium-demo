package LABS;
import java.util.*;
public class LAB125 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(sum(list1)); //45

        List<Integer> list2 = Arrays.asList(23, 4, 12, 33, 56, 22, 12, 77, 89);
        System.out.println(sum(list2)); //328
    }
    public static int sum(List<Integer> ints){
        int sum = 0;
        for(int i : ints){
            sum += i;
        }
        return sum;
    }
}
