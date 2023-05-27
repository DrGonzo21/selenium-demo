package Assignments;

public class Assignment11 {
    public static void main(String[] args) {
        System.out.println(reverse("Programming isn't about what you know; it's about what you can figure out."));
    }
    public static String reverse(String str){
        String str2 = "";
        for (int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            str2 = ch+str2;
        }
        System.out.println(str2);
        return "";
    }
}
