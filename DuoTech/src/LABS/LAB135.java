package LABS;
import java.util.*;

public class LAB135 {
    public static void main(String[] args) {
        String[] arr1 = {"Apple", "Orange", "Banana"};
        String[] arr2 = {"Red", "Orange", "Yellow"};
        String[] arr3 = {"Left", "Right", "Forward", "Back"};

        ArrayList<String> list1 = array2List(arr1);
        ArrayList<String> list2 = array2List(arr2);
        ArrayList<String> list3 = array2List(arr3);

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
    }
    public static ArrayList<String> array2List(String[] stringArray){
        ArrayList<String> list = new ArrayList<>(Arrays.asList(stringArray));
        return list;
    }
}
