package String;

public class makeEveryOtherCharCap {
    public static void main(String[] args) {


        String str = "Jerrod";

        char[] words = str.toCharArray();

        for (int i = 0; i < words.length; i += 2) {
            words[i] = Character.toUpperCase(words[i]);
        }
        return new String(words);
    }
}

