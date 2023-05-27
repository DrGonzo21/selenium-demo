package LABS;
import java.util.*;

public class LAB127 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("hi");
        list1.add("what");
        list1.add("who");
        addYo(list1);
        System.out.println(list1); //[hello,yo,hi,yo,what,yo,who]

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("hello");
        list2.add("what");
        list2.add("who");
        addYo(list2);
        System.out.println(list2); //[hello,yo,what]

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("hello");
        list3.add("what");
        addYo(list3);
        System.out.println(list3); //[hello,yo,what]
    }

    public static void addYo(ArrayList<String> words){

        ArrayList<String> newWords = new ArrayList<>();


        for (int i = 0; i < words.size()-1;i++) {
            newWords.add(words.get(i));
            newWords.add("yo");
        }
        newWords.add(words.get(words.size()-1));
        words.clear();
        words.addAll(newWords);
        }
    }

