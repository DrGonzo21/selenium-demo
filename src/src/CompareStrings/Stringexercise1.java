package CompareStrings;

public class Stringexercise1 {

    public static void main(String[] args) {

        System.out.println(comboString("Hello", "hi")); // → "hiHellohi"
        System.out.println(comboString("hi", "Hello")); // → "hiHellohi"
        System.out.println(comboString("aaa", "b")); // → "baaab"
        System.out.println(comboString("b", "aaa")); // → "baaab"
        System.out.println(comboString("aaa", "")); // → "aaa"
        System.out.println(comboString("", "bb"));
    }

    public static String comboString(String a, String b){


        if (a.length() > b.length()) {
            System.out.println(b+a+b);

            if (b.length() > a.length())
                System.out.println(a+b+a);
        }





        return "";
    }
}

