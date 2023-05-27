package LABS;

public class LAB116A {
    public static void main(String[] args) {
        System.out.println(removeConsecutiveDuplicates("abbcccddddeeeee")); // "abcde"
        System.out.println(removeConsecutiveDuplicates("aaaabcccccccccddefffffffffff")); // "abcdef"

    }
    public static String removeConsecutiveDuplicates(String input){
        StringBuilder sb = new StringBuilder();
        char b = '\0';
        for (char c : input.toCharArray()) {
            if (c != b){
                sb.append(c);
                b = c;
            }
        }
        return sb.toString();
    }

}
