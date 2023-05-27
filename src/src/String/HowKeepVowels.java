package String;

public class HowKeepVowels {
    public static void main(String[] args) {
        System.out.println(keepVowels("I am the best at this!"));
    }
        public static String keepVowels(String str){

            for(int i=0; i<str.length(); i++) {
                if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'||
                        str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
                        str.charAt(i) == 'u')

                    System.out.print(str.charAt(i));
            }
            return"";
    }
}
