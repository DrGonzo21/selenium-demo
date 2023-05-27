package Numbers;
import java.util.Random;

public class reverseNums {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Four digit number random");
        int a = random.nextInt(10);
        int b = random.nextInt(10);
        int c = random.nextInt(10);
        int d = random.nextInt(10);
        System.out.println(""+ a + b + c + d );

        System.out.println("and reverse");
        System.out.println(""+ d + c + b + a  );


    }
}
