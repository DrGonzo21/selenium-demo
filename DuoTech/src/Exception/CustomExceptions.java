package Exception;

public class CustomExceptions {

    public static void main(String[] args) {

    launchBrowser("brave");
    }

    public static void launchBrowser(String browser) {

        if (browser.equalsIgnoreCase("Chrome")) {
            System.out.println("Launching Chrome");
        } else if (browser.equalsIgnoreCase("Edge")) {
            System.out.println("Launching Edge");
        } else if (browser.equalsIgnoreCase("Safari")) {
            System.out.println("Launching Safari");
        } else {
            throw new InvalidBrowserException("Invalid browser: " + browser);
        }
    }
}