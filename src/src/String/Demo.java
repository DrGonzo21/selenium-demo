package String;

public class Demo {
    public static void main(String[] args) {
        // Reference type

        //
        // Classname varName = new Classname();
//        Scanner scan =  new Scanner(System.in);

        String str = "java";
        String str2 = new String("java");


        // String methods are instance methods
        // instance method -> method that requires an object to be created
        // Math.max(2,4);//

        String name = "Johnny W";
//        int length = name.length();
        System.out.println(name.length()); //actual number of chars in the string

        String str3 = ""; // empty string
        System.out.println(str3.length()); // 0

        String message = "Welcome to Java!";

        char ch = message.charAt(0);
        System.out.println(ch);
        System.out.println(message.charAt(4));
        // to obtain the last index of any string use str.length()-1
//        int last = message.length()-1;
//        System.out.println(message.charAt(last));

        // to obtain the char at last index
        System.out.println(message.charAt(message.length()-1));

        System.out.println(message.charAt(message.length()-2));
        System.out.println(message.charAt(message.length()-3));

        // try to obtain char at index -1 (or any invalid index)

//        System.out.println(message.charAt(-1));
        //StringIndexOutOfBoundsException: String index out of range: -1

//        System.out.println(message.charAt(16));

//        System.out.println("java".length());
//        System.out.println("java".charAt("java".length()));

        System.out.println("".charAt(0)); //StringIndexOutOfBoundsException
    }
}
