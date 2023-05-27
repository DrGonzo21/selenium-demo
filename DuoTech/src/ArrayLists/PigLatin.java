package ArrayLists;


import java.util.ArrayList;

public class PigLatin {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();

        list.add("java");
        list.add("hello");
        list.add("hi");
        list.add("phone");

        ArrayList<String> updatedList = changePiglatin(list);
        System.out.println(updatedList);
    }

    public static ArrayList<String> changePiglatin(ArrayList<String> list){

       String list2 = "";

       for (int i = 0; i < list.size(); i++){
           list2 = list.get(i);
           String sub = list2.substring(0,1);
           String last = list2.substring(1);
           String all = last + sub;
           list.set(i,all + "ay");
       }
       return list;


    }
}
