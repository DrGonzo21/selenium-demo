package Sets;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {

        System.out.println(removeDuplicates("aaafffbccccdde"));

        // Call the method and print out the returned value

    }
    public static String removeDuplicates(String str) {

        Set<Character> uniqueChars = new LinkedHashSet<>();

        for(char c : str.toCharArray()){
            uniqueChars.add(c);
        }
        StringBuilder s = new StringBuilder();
        for(char c : uniqueChars ){
            s.append(c);
        }
        return s.toString();
    }
}
