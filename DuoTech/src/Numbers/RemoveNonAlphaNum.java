package Numbers;

public class RemoveNonAlphaNum {
    public static void main(String[] args) {
        System.out.println(removeNonAlphaNumeric("hello&World%hi%java"));
        System.out.println(removeNonAlphaNumeric("Vsh%68d@hd9&!cx"));
    }

    public static String removeNonAlphaNumeric(String str) {

        String str2 = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isLetterOrDigit(ch)) {

                str2 += ch;
            }
        }
        return str2;
    }
}

