package ContinueLoop;

public class ConLoop {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                continue; //skips the rest of the iteration code and continues with the next iteration
            }
            System.out.println(i);

        }
    }
}
