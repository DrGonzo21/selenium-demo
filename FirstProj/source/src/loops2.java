public class loops2 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Please enter yes: ");

        String user = input.next();

        while (! user.equals("yes")) {


            System.out.println("You didnt enter yes:");

            user = input.next();


        }

        System.out.println("you enter yes");
    }
    }