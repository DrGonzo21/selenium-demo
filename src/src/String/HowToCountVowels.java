package String;

public class HowToCountVowels {

    public static void main(String[] args) {
        System.out.println(countVowels("obama"));
    }
    public static String countVowels(String sentence){

        int count = 0;

        for (int i=0 ; i<sentence.length(); i++){

            char ch = sentence.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
                count ++;
            }
        }
        System.out.println(count);

        return "";
    }
}
