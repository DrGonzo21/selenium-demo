package Loops;


public class whileloop {
    public static void main(String[] args) {
        printMessage("Hello", 1000);
    }
    public static void printMessage(String str, int times) {

        while (times > 0) {
            System.out.println(str +" "+ times);

            times--;

        }
    }
}
