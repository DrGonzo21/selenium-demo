package String;

public class RemoveNonNumbs {
    public static void main(String[] args) {
    }
    public static String removeNonAlphaNumeric(String str){
        String str2 = "";

        for(int i = 0 ; i < str.length();i++){

            char ch = str.charAt(i);

            if(Character.isLetterOrDigit(ch)){


                str2 += ch;



            }
        }
        return str2;
    }
}
