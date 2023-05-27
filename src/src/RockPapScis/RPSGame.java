package RockPapScis;
import java.util.Scanner;

public class RPSGame {

    public static void main(String[] args) {
        String[] rps = {"1", "2", "3"};
        String computermove = rps[new Random().nextInt(rps.length)];
        Scanner scan = new Scanner(System.in);
        // 1 = rock, 2= paper, 3= scissors

        System.out.println("enter 1 for Rock, 2 for Paper, and 3 for Scissors");
        player = scan.nextInt();


        if (player.equals(computermove))
            System.out.println("tie");
        else if (player.equals("1"))
            if (computermove.equals("2"))
                System.out.println("you lose");
            else if (computermove.equals("3"))
                System.out.println("you win");

        if (player.equals("2"))
            if (computermove.equals("3"))
                System.out.println("you lose");
            else if (computermove.equals("1"))
                System.out.println("you win");

        if (player.equals("3"))
            if (computermove.equals("1"))
                System.out.println("you lose");
            else if (computermove.equals("2"))
                System.out.println("you win");

        System.out.println("Computer played:" + computermove);


    }
}