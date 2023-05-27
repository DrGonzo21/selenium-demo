package LABS;

public class LAB52 {
    public static void main(String[] args) {
        System.out.println(isAnagram("abca", "caba")); // true
        System.out.println(isAnagram("abc", "abb")); // false
        System.out.println(isAnagram("night", "thing")); // true
        System.out.println(isAnagram("cola", "loco")); // false

    }

    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] charCount = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i) - 'a']++;
        }


        for (int i = 0; i < str2.length(); i++) {
            charCount[str2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (charCount[i] != 0) {
                return false;
            }
        }

        return true;
    }
}

