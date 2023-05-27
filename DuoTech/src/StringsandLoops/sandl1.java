package StringsandLoops;

public class sandl1 {

        public static void main(String[] args) {
            System.out.println(alternative("powerful"));
            System.out.println(alternative("acroBATics"));
        }

        public static String alternative(String str) {  // Don't change anything on this line
            char[] words = str.toCharArray();
            for (int i = 0; i < words.length; i += 2) {
                words[i] = Character.toUpperCase(words[i]);
            }
            return new String(words);

        }
    }

