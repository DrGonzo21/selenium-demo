package Stringbuilder;

public class SBClassNotes {
    public static void main(String[] args) {
//        String str = new String("java");
//        str = str.concat("script");
//        System.out.println(str);

//        StringBuilder sb = new StringBuilder();

        StringBuilder sb = new StringBuilder("java");
        sb.append("script").append("hello").append("hi").append(34).append(true).append(new char[]{'a', 'b', 'c'});
        System.out.println(sb);
        // StringBuilder uses Builder pattern, where methods can be chained


//        sb.deleteCharAt(0);
//        System.out.println(sb);
//        sb.deleteCharAt(sb.length()-1);
//        System.out.println(sb);

        sb.delete(0, 3);
        System.out.println(sb);
        //sb.delete(-1,3);
        sb.delete(sb.length() - 5, sb.length());
        System.out.println(sb);
        // Since the StringBuilder is mutable every call modifies the object

        //        for (int i = 0; i < sb.length(); i++) {
//            sb.deleteCharAt(i);
//            i--;
//        }

        System.out.println(sb);


        sb.insert(0, "type");

        System.out.println(sb);

        sb.insert(sb.length()/2, "java");
        System.out.println(sb);

        sb.replace(sb.indexOf("hello"),sb.indexOf("hello")+"hello".length(), "hola" );

        sb.setCharAt(0, 'T');

        System.out.println(sb);


        StringBuilder sb2 = new StringBuilder("I love Java");
        sb2.reverse();

        System.out.println(sb2);

        // Conversion of String to a StringBuilder

        String str = "Hello";

        StringBuilder sb3 = new StringBuilder(str);

        sb3.reverse();

        // Conversion of StringBuilder to a String

        String s = String.valueOf(sb3);

        System.out.println(s);

        String sb3String = sb3.toString();

        System.out.println(sb3String);

        System.out.println(   reverse("I love Java") );


        // "cjv324vgv423vb4v23v43hc4c34v2343g24" -> "324423


        StringBuilder sb4 =  new StringBuilder("Show");

//        String substring = sb4.substring(3);
//
//        System.out.println(substring);

        sb4.append(" me").insert(0, "You ").delete(2,4).replace(0,2,"Hi");

        System.out.println(sb4);
    }



    public static String reverse(String str){

        return new StringBuilder(str).reverse().toString();

    }



    public static String collectAllNumbers(String str){

        StringBuilder collect = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit( str.charAt(i) )){
                collect.append(str.charAt(i));
            }
        }

        return collect.toString();
    }

}
