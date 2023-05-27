package String;

public class reverseString {
    public static void main(String[] args) {

        System.out.print(reverse("Programming isn't about what you know; it's about what you can figure out."));

    }

    public static String reverse(String str){

        String nstr = "";


        for (int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            nstr= ch+nstr;
        }
        System.out.println(nstr);

        return "";
    }
}

