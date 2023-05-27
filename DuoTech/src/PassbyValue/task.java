package PassbyValue;

public class task {
    public static void main(String[] args) {
        int number = 1;
        String letters = "abc";
        num(number);
        letters = letters(letters);
        System.out.println(number + letters);

    }

    public static int num(int num) {

    num++;
    return num;
}
public static String letters(String letters){
    letters += "d";
    return letters;
}
}
