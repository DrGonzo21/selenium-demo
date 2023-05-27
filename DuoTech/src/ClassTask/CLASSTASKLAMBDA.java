package ClassTask;
import java.util.*;

public class CLASSTASKLAMBDA {
    public static void main(String[] args) {

        System.out.println(formatNames(new ArrayList<>(Arrays.asList("", "", "jenny87", "1JOHN", "", "%BoB", "aliCE#", "Alina", "aNnA" ))));
    }



    public static List<String> formatNames(List<String> names){


        names.removeIf(s -> s.isEmpty() || s.matches("[^a-zA-Z]"));
        names.replaceAll(name -> name.replaceAll("[^a-zA-Z]", "").substring(0, 1).toUpperCase() + name.replaceAll("[^a-zA-Z]", "").substring(1).toLowerCase());
        return names;
    }
}

