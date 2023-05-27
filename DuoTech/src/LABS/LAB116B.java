package LABS;

public class LAB116B {
    public static void main(String[] args) {
        System.out.println(interleaveStrings("abc", "def"));//"adbecf"
        System.out.println(interleaveStrings("hello", "world"));//"hweolrllod"
        System.out.println(interleaveStrings("a", "bcdefg"));//"abcdefg"
        System.out.println(interleaveStrings("abc", ""));//"abc"


    }
    public static String interleaveStrings(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int len = Math.min(s1.length(),s2.length());
        for (int i = 0; i < len; i++){
            sb.append(s1.charAt(i)).append(s2.charAt(i));
        }
        sb.append(s1.substring(len)).append(s2.substring(len));
        return sb.toString();
    }
}
