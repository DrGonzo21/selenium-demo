package Numbers;
import java.util.Random;

public class ccGenerator {
    public static void main(String[] args) {


        System.out.println("getRandomCreditCardNo(1)");
        System.out.println("getRandomCreditCardNo(2)");






        Random rand = new Random();
        long first14 = (long) (Math.random() * 100000000000000L);
        long first15 = (long) (Math.random() * 10000000000000000L);

        switch ("getRandomCreditCardNo()") {


            case "getRandomCreditCardNo(1)":
                System.out.print("3" + first14);

                break;

            case "getRandomCreditCardNo(2)":
                System.out.print("4" + first15);

                break;

            case "getRandomCreditCardNo(3)":
                System.out.print("5" + first15);

                break;

            case "getRandomCreditCardNo(4)":
                System.out.print("6" + first15);

                break;

            default:
                System.out.println(0);

                break;


        }
    }
}
