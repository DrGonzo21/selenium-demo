package Notes;

public class Strings {
    public static void main(String[] args) {
        String str = "hello";
        String str2 = new String("hello");

        String str3 = "hello";
        // Java would check in the String pool if hello is already created and would that instead,
        // to save for memory and performance -> String literal (created in a string pool)


        // Stack memory -> reference / primitives
        // heap memory -> memory location / long term data
        // heap has a special location called String pool

        // interview question: How many String objects are created in the following code:

        String str5 = new String("Burritto");

        // 2 objects, 1 is in String pool("Burritto"), 1 is created in the heap memory(new String("Burritto").


    }
}
