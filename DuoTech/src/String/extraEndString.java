package String;
import java.util.*;

public class extraEndString {
    public static void main(String[] args) {
        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("Hi"));
        System.out.println(extraEnd("School"));
    }
    public static String extraEnd(String str){

        String substring = str.substring(str.length()-2);

        System.out.print(substring+substring+substring);

        return "";
    }
}
