package ClassTask;
import java.util.*;
public class ClassTask66 {





        public static void main(String[] args) {

            List<Character> list = new ArrayList<>();

            list.add('a');
            list.add('a');
            list.add('a');
            list.add('b');
            list.add('c');
            list.add('c');
            list.add('c');
            list.add('d');
            list.add('d');
            list.add('d');
            list.add('a');


            removeDuplicates(list);
            System.out.println(list);  //   [a, b, c, d]

        }

        public static void removeDuplicates(List<Character> list) {

            Set<Character> set = new HashSet<>(list);
            list.clear();
            list.addAll(set);
        }
    }

