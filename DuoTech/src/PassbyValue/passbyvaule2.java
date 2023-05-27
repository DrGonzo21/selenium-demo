package PassbyValue;

public class passbyvaule2 {
    public static void main(String[] args) {

        // Pass-By-Value for Strings works the same as in primitives

        String str = "hello";

        uppercaseAll(str);

        System.out.println(str);

    }
    public static void uppercaseAll(String str){
      str = str.toUpperCase();
    }
}
