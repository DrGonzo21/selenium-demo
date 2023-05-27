package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversionBetweenLIstandArray {

    public static void main(String[] args) {

        //convert an array to a list
        Integer[] arr = {1,2,3,4,5};
        List<Integer> integers = Arrays.asList(arr); // works only for array of wrapper types

        // to convert the array of primitives you can use Streams

        int[] arr2 = {1,2,3,4,5};
        List<Integer> list = Arrays.stream(arr2)
                .boxed()
                .toList();

        // convert a list into an array

        List<Integer> integerList = List.of(1,2,3,4,5,6,7);

        Integer[] array = integerList.toArray(new Integer[integerList.size()]);
        Integer[] array1 = integerList.toArray(Integer[]::new);



    }
}
