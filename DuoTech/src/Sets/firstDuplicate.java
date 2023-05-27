package Sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class firstDuplicate {

    public static void main(String[] args) {

        System.out.println(firstduplicate("abcdefbcdef"));

        // Call the method and print out the returned value

    }

    public static Character firstduplicate(String str) {

        Set<Character> set = new LinkedHashSet<>();

        for (char ch : str.toCharArray()) {
            if (!set.add(ch)) {
               return ch;
            }
        }
        return null;
    }
}




