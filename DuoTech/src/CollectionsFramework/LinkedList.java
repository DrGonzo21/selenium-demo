package CollectionsFramework;

import java.util.List;

public class LinkedList {

    public static void main(String[] args) {

        List<String> linkedList = new java.util.LinkedList<>();

        linkedList.add("Cat");
        linkedList.add("Dog");
        linkedList.add("wolf");
        linkedList.add("bear");
//        ((LinkedList) linkedList).addFirst("snake");
//        ((LinkedList) linkedList).addLast("bird");

        System.out.println(linkedList);
        linkedList.get(1);
//        System.out.println(((LinkedList<String>)linkedList).getFirst());


      //          the main reason to use linked list over arraylist is performance
        //arraylist provides constant time O(1) for get() and set()
    }

}
