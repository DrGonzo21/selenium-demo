package Games;
import java.util.Scanner;
import java.util.Random;

public class rockPaperScissors {
    public static void main(String[] args) {


        String[] rps = {"1", "2", "3"};
        String computermove = rps[new Random().nextInt(rps.length)];
        Scanner scan = new Scanner(System.in);
        String playerMove;
        // 1 = rock, 2= paper, 3= scissors

        System.out.println("enter 1 for Rock, 2 for Paper, and 3 for Scissors");
        playerMove = scan.nextLine();


        if (playerMove.equals(computermove))
            System.out.println("You played" + playerMove + "computer played" + computermove + "tie");
        else if (playerMove.equals("1"))
            if (computermove.equals("2"))
                System.out.println("You play rock and computer played paper, you lose");
            else if (computermove.equals("3"))
                System.out.println("You play rock and computer play scissors, you win");

        if (playerMove.equals("2"))
            if (computermove.equals("3"))
                System.out.println("you play paper and computer play scissors, you lose");
            else if (computermove.equals("1"))
                System.out.println("you play paper and computer play rock, you win");

        if (playerMove.equals("3"))
            if (computermove.equals("1"))
                System.out.println("you play scissors and computer play rock, you lose");
            else if (computermove.equals("2"))
                System.out.println("you play scissors and computer play paper, you win");


    }
}
