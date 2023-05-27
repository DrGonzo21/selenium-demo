package String;

public class HowToCountChars {
    public static void main(String[] args) {

    }
        public static String countA(String str){
            // count each characters except spaces

            int count = 0;

            for(int i=0; i < str.length(); i++) {
                char ch = str .charAt(i);
                if(ch >= 'A' && ch <= 'a')

                    count++;

            }

            System.out.println(count);





            return "";
    }
}
