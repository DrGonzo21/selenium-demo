package LABS;
import java.util.*;

public class LAB136 {
    public static void main(String[] args) {


        List<String> list1 = Arrays.asList("Apple", "Orange", "Banana");
        List<String> list2 = Arrays.asList("Red", "Orange", "Yellow");
        List<String> list3 = Arrays.asList("Left", "Right", "Forward", "Back");

        String[] arr1 = list2Array(list1);
        String[] arr2 = list2Array(list2);
        String[] arr3 = list2Array(list3);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

    }

    public static String[] list2Array(List<String> stringList){

        String[] stringArray = new String[stringList.size()];
        for (int i = 0; i < stringList.size(); i++){
            stringArray[i] = stringList.get(i);

        }
        return stringArray;
    }
}
