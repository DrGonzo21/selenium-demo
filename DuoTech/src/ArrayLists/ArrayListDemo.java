package ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {


    public static void main(String[] args) {



//        ArrayList arr = new ArrayList();
//
//        arr.add("Hello");
//        arr.add("Hi");
//        arr.add(45);
//        arr.add(1.45);

        ArrayList<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("Hi");

        System.out.println(list);
        System.out.println(list.get(0));

        String s = list.get(0);


        ArrayList<Integer> list2 = new ArrayList<>();
        int k = 45;
        list2.add(k); // autoboxed

//        ArrayList<Integer> list3 = new ArrayList<>(10);

        // What is the default capacity of ArrayList?
        // 10
        // What increase rate once default capacity is reached?
        // 50%

        System.out.println(list2);
        System.out.println(list2.size());


//        List<String> names =  new ArrayList<>();  // common syntax for arraylist intialization
//        System.out.println(names);
//        System.out.println(names.get(0));

        ArrayList<String> names =  new ArrayList<>();

        names.add("Jason");
        names.add(0,"Heather");
        names.add(2,"Shannon");

        System.out.println(names);

        names.add(names.size()-2, "John");

        System.out.println(names);
//        names.clear();
//
//        System.out.println(names);

        System.out.println(names.contains("Jason"));
        System.out.println(names.contains("Jason Bourne"));


        for (int j = 0; j < names.size(); j++) {
            System.out.println(names.get(j));  // names[i]
        }


        System.out.println( names.indexOf("Jason"));
        System.out.println( names.lastIndexOf("Jason"));
        System.out.println( names.indexOf("Bourne"));


//        while(!names.isEmpty()){
//
//        }

        names.remove("Heather");

        System.out.println(names);

        names.remove(0);

        System.out.println(names);

        ArrayList<Integer> list4 =  new ArrayList<>();

        list4.add(1);
        list4.add(0);
        list4.add(2);
        list4.add(3);
        list4.add(null);

        System.out.println(list4);

        list4.remove(0); // primitive

        list4.remove(Integer.valueOf(3)); // object

        System.out.println(list4);


        ArrayList<String> names2 =  new ArrayList<>();

        names2.add("Jason");
        names2.add(0,"Heather");
        names2.add(2,"Shannon");

        System.out.println(names2);
//        names2.set(1,"Gson");   // names[1] =  "Gson";
        names2.set(1, names2.get(1).toUpperCase());   // names[1] =  names[1].toUppercase();

        System.out.println(names2);


        for (int i = 0; i < names2.size(); i++) {
            names2.set(i, names2.get(i).toUpperCase());
        }

        System.out.println(names2);


        for (String name : names2) {
            name = name.toLowerCase();
        }

        System.out.println(names2);


        ArrayList<String> namesEmptied = doSomething(names2);

        System.out.println(namesEmptied);

        ArrayList<ArrayList<String>> twoDArraylist;





    }




    public static ArrayList<String> doSomething(ArrayList<String>  coll ){
        coll.clear();
        return coll;
    }
}