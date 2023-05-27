package LABS;
import java.util.*;

public class LAB130 {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(-6);
        list.add(3);
        list.add(-8);
        list.add(-1);
        list.add(4);
        list.add(3);

        System.out.println(sumAppend(list)); // [4,3,4,3,14]

    }

    public static ArrayList<Integer> sumAppend(ArrayList<Integer> nums){

        ArrayList<Integer> positiveNums = new ArrayList<>();

        int sum = 0;

        for(int i : nums){

            if(i > 0){

                positiveNums.add(i);
                sum += i;
            }
        }

        positiveNums.add(sum);
        return positiveNums;

    }
}
