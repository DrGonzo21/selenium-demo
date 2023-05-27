package LABS;

public class LAB47 {
    public static void main(String[] args) {

        System.out.println(withouEnd2("Hello") ); //→ "ell"
        System.out.println(withouEnd2("abc")); // → "b"
        //System.out.println(withouEnd2("ab")); // → ""
        //System.out.println(withouEnd2("a") ); //→ ""
        //System.out.println(withouEnd2("")); // → ""
    }
    public static  String withouEnd2(String str) {

        String last = str.substring (1, str.length() - 1);

        System.out.println(last);

        return "";
    }
}

