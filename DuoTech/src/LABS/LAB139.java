package LABS;
import java.util.*;

public class LAB139 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2);
        int value = 2;
        boolean hasDuplicate = foundIntTwice(numbers, value);
        System.out.println(hasDuplicate);

        numbers = Arrays.asList(5, 7, 8, 9, 10);
        value = 6;
        hasDuplicate = foundIntTwice(numbers, value);
        System.out.println(hasDuplicate);

        numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 9);
        value = 9;
        hasDuplicate = foundIntTwice(numbers, value);
        System.out.println(hasDuplicate);
    }
    public static boolean foundIntTwice(List<Integer> integerList, int intToFind){

        int count = 0;

        for(int i : integerList){
            if(i == intToFind){
                count++;
                if(count >= 2){
                    return true;
                }
            }
        }
        return false;
    }
}
