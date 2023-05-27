package Games;
import java.util.Scanner;

public class bottlesOfBeer {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter drink:");
        String drinkType = scan.nextLine();

        System.out.println("Please enter how many times?");
        int times = scan.nextInt();

        printLyrics(drinkType, times);
    }
    public static void printLyrics(String drinkType, int times){

        for(int i = times ; i > 0; i--){
            System.out.println(i + " bottles of "+ drinkType + " on the wall. "+"\n"  + i +" bottles of "+ drinkType +" on the wall. "+"\n" + i + " bottles of "+ drinkType +" ! "+"\n" + i + " Take one down. Pass it around. ");

            i--;

        }
        if(times==1){
            System.out.println(times + " bottle of "+ drinkType + " on the wall. "+"\n"+ times + " bottle of "+ drinkType +" on the wall. "+"\n" +
                    times + " bottle of "+ drinkType +" ! "+"\n" +
                    " Take one down. Pass it around. ");
        }
        if(times==0){
            System.out.println(" No more bottles of "+ drinkType +" on the wall. ");
        }

    }
}


