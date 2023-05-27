package String;
import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below


        String str = word.toLowerCase();
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'))
                System.out.print(ch);

        }
    }
}
