package Exception;

public class ThrowException {

    public static void main(String[] args) {

        launchBrowser("chrome");
        System.out.println("Do something with specific browser");
    }

    public static void launchBrowser(String browser){
        if(browser.equalsIgnoreCase("chrome")) {
            System.out.println("Launching chrome");
        } else if (browser.equalsIgnoreCase("edge")) {
            System.out.println("Launching edge");

        }else if (browser.equalsIgnoreCase("firefox")) {
            System.out.println("Launching firefox");
        }else {
//            RuntimeException runtimeException = new RuntimeException();
            throw new RuntimeException(browser + "  :is a unsupported browser");

            //throw and throws
            //throw - used to explicity throw an exception in the code
            //throws - used to declare a method might throw a exception, can come only in the method header
    }
    }
}
