package LABS;
import java.util.*;
import java.util.stream.Collectors;

public class LAB143 {

        public static void main(String[] args) {
            //TESTS

            System.out.println(moreY(new ArrayList<>(Arrays.asList("a", "b", "c")))); //["yay", "yby", "ycy"]
            System.out.println(moreY(new ArrayList<>(Arrays.asList("hello", "there")))); //["yhelloy", "ytherey"]
            System.out.println(moreY(new ArrayList<>(Arrays.asList("yay")))); //["yyayy"]
        }


        public static List<String> moreY(List<String> list){

            return list.stream()
                    .map(s -> "y" + s + "y")
                    .collect(Collectors.toList());
        }
    }

