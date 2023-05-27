package LABS;
import java.util.ArrayList;

public class LAB134 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hi");
        list.add("que");
        list.add("paso");
        list.add("sup");

        everyOther(list);

        System.out.println(list); //[hi, paso]
    }
    public static void everyOther(ArrayList<String> nums){
        for(int i = nums.size() - 1; i > 0; i -= 2){
            nums.remove(i);
        }
        nums.remove(0);
    }
}
