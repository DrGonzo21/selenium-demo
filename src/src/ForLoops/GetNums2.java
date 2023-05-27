package ForLoops;
import java.util.Scanner;

public class GetNums2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("In:");
        int end = inp.nextInt();
        //write your code below
        int i = 0;
        int j = end + i;

        while (i < end) { //condition
            System.out.print(i + "\t");
            System.out.println("\t" + (j + i));

            i++;// update
        }
    }
}
