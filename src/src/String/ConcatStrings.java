package String;

public class ConcatStrings {
    public static void main(String[] args) {
        System.out.println(minCat("Hello", "java"));
    }
    public static String minCat(String str1, String str2){

        int minLength = Math.min(str1.length(), str2.length());

        String concatenated = str1.substring(1, minLength+1) + str2.substring(0, minLength);

        return concatenated;

    }
}
