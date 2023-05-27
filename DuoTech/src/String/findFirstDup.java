package String;

public class findFirstDup {
    public static void main(String[] args) {
        duplicate("avcdevfc");
    }

    public static void duplicate(String str){
        char ch = ' ';

        outer:

        for(int i = 0; i < str.length() ; i++) {

            for (int j = i + 1; j < str.length() - 1; j++) {

                if (str.charAt(i) == str.charAt(j)) {

                    ch = str.charAt(j);

                    break outer;
                }
            }
        }
        System.out.print((ch));
        }
}

