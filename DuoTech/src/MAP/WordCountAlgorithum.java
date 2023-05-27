package MAP;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCountAlgorithum {

    public static void main(String[] args) {

        List<String> words = List.of("hello", "hi", "is", "word", "a", "the", "hello", "hi", "is", "hello", "hi", "is", "word", "a");

        // hello = 3, hi = 2, is = 4, hola = 1


        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
//
//            if(!map.containsKey(word)){ // if map doesnt contain the word as a key
//                map.put(word,1);
//
//            }else {
//               Integer value = map.get(word); // grab the current value
//               value++;
//               map.put(word,value); // update the current value with the incremented one
            // map.put(word, map.get(word) +1); shorter verison of above
//            }
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(" Word counts: " + map);


        Map<String, Integer> map3 = new HashMap<>();
        map3.put("apple", 10);
        map3.put("apple",20);
        map3.putIfAbsent("banana",20);
        System.out.println(map3); // outputs: {apple=10, banana=20}
    }
}

