package ClassTask;
import java.util.Random;

public class CLASSTASK51 {
    public static void main(String[] args) {

        int[][] arr = new int[7][9];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(25) + 1;
            }
        }
        int largest = arr[0][0];
        int row = 0;
        int col = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > largest) {
                    largest = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" Largest Value is: " + largest);
        System.out.println(" Index Array "+"["+row+"]"+"["+col+"]");
    }
}
