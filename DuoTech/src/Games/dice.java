package Games;
import java.util.Random;

public class dice {
    public static void main(String[] args) {

        Random rand = new Random();


        int number = rand.nextInt(6) + 1;
        int dice = rand.nextInt(6) + 1;

        System.out.println("Die 1#: " + number);
        System.out.println("Die 2#: " + dice);
        System.out.println("Total: " + (number + dice));

    }
}
