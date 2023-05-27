package ArrayLists;
import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("purple", "green", "blue", "yellow", "green");
        List<String> reversedList = reverseList(stringList);
        System.out.println(reversedList);

        stringList = Arrays.asList("jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way");
        List<String> reversedList1 = reverseList(stringList);
        System.out.println(reversedList1);
    }

    public static List<String> reverseList(List<String> stringList){
        List<String> reversed = new ArrayList<>(stringList);
        Collections.reverse(reversed);
        return reversed;
    }
}
