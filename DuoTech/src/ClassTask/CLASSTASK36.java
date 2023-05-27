package ClassTask;

public class CLASSTASK36 {
    public static void main(String[] args) {
        duplicate("avcdevfc");
        duplicate("aacdevfc");
        duplicate("acdedfce");
    }
    public static void duplicate(String str){
        char ch = ' ';
        outer:
        for (int i = 0; i < str.length(); i++){
            for (int j = i + 1; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)){
                    ch = str.charAt(i);
                    break outer;
                }
            }
        }
        System.out.println(ch);
    }
}
