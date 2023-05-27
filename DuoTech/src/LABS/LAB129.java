package LABS;
import java.util.*;

public class LAB129 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList(new String[]{"java", "python", "java", "scala", "ruby", "closure", "java"}));
        removeAll(list, "java");
        System.out.println(list);

        List<String> list2 = new ArrayList<>(Arrays.asList(new String[]{"java", "java", "java"}));
        removeAll(list2, "java");
        System.out.println(list2);
    }

    public static void removeAll(List<String> list, String targetWord){
        list.removeIf(word -> word.equals(targetWord));
    }
}
