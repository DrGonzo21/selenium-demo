package Games;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzArrays {

    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {4, 5, 6};
        Integer[] arr3 = {7, 8, 9, 10, 11, 12, 13, 14, 15};

        ArrayList<String> list1 = fizzBuzzList(arr1);
        ArrayList<String> list2 = fizzBuzzList(arr2);
        ArrayList<String> list3 = fizzBuzzList(arr3);

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
    }

    public static ArrayList<String> fizzBuzzList(Integer[] integerArray){
        List<String> result = new ArrayList<>();

        for (int num: integerArray){
            if (num % (5*3) == 0) {
                result.add("FizzBuzz");
            }else if (num % 3 == 0) {
                result.add("Fizz");
            }else if (num % 5 == 0) {
                result.add("Buzz");
            }else {
                result.add(Integer.toString(num));
            }
        }
        return new ArrayList<String>(result);
    }
}

