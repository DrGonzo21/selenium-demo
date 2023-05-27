package LABS;

public class LAB115 {
    public static void main(String[] args) {
        String str1 = "https://www.duotech.io/";
        String str2 = "HGN)B#Rmck~Xv3";
        String str3 = "(703) 569-1510";


        String result1 = removeNonAlphaNumeric(str1);
        String result2 = removeNonAlphaNumeric(str2);
        String result3 = removeNonAlphaNumeric(str3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    public static String removeNonAlphaNumeric(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetterOrDigit(c)){
                sb.append(c);
            }

        }
        return sb.toString();
    }
}
