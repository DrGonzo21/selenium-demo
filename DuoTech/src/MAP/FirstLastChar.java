package MAP;
import java.util.*;

public class FirstLastChar {

    public static void main(String[] args) {
        
        String[] str = {"man","moon","good","night"};
        Map<String, String> result = pairs(str);
        result.forEach((firstChar,lastChar) -> System.out.println(firstChar + " : " + lastChar));
    }
    public static Map<String,String> pairs(String[] word){

        Map<String, String> result = new HashMap<>();

        for (String s : word){
            result.put(String.valueOf(s.charAt(0)),String.valueOf(s.charAt(s.length() - 1)));
        }
        return result;
    }
}
