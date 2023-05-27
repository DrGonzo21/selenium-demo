package Exception;

public class MultiCatch {

    public static void main(String[] args) {

        try {
            System.out.println(9 / 0);
            System.out.println(Integer.parseInt("kjhsdf"));
            System.out.println(new int[]{1, 2, 4}[4]);



        } catch(ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
        e.printStackTrace();
        throw e;      // rethrowing exception   || throw new RuntimeException(e);

        }
    }
}
