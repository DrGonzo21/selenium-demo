package Exception;

public class ExceptionDemo2 {

    public static void main(String[] args) {


        //Checked: Exception class and its subclasses

        // Unchecked: RuntimeException and Error and its subclasses

//        String str = null;
//        System.out.println(str.substring(2));

        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
        }
    }
}
