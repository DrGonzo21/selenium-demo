package LABS;

//Create a method that checks if a String is a palindrome. Punctuation, capitalization, and spaces are ignored in this case.
//        Use StringBuilder class methods to implement the method.

public class LAB116 {
    public static void main(String[] args) {
        String str1 = "Able was I ere I saw Elba";
        String str2 = "Show me the code";

        boolean result1 = isPalindrome(str1);
        boolean result2 = isPalindrome(str2);
        System.out.println(result1);
        System.out.println(result2);
    }
    public static boolean isPalindrome(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetterOrDigit(c)){
                 sb.append(Character.toLowerCase(c));
            }

        }
        String normalized = sb.toString();
        String reversed = sb.reverse().toString();
        return normalized.equals(reversed);
    }
}
