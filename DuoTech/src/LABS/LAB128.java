package LABS;
import java.util.*;

public class LAB128 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("hey", "yo");
        List<String> list2 = Arrays.asList("what", "up");

        System.out.println(combineTwo(list1, list2));

        List<String> list3 = Arrays.asList("hi", "hello");
        List<String> list4 = Arrays.asList("how", "do", "you", "do");

        System.out.println(combineTwo(list3, list4));

    }

    public static List<String> combineTwo(List<String> wordList1, List<String> wordList2) {
        List<String> combinedWords = new ArrayList<>();
        combinedWords.addAll(wordList1);
        combinedWords.addAll(wordList2);

    return combinedWords;
    }
}
