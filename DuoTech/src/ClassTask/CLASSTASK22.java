package ClassTask;
import java.util.Scanner;

public class CLASSTASK22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the statement you want printed ");
        String str = scan.nextLine();
        System.out.println();
        System.out.println(" Enter how times you want the message printed ");
        int i = scan.nextInt();
        while(i > 0){
            System.out.println(str);
        }
    }
}
