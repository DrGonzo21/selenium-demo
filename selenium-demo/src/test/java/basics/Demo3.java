package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Demo3 {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        //1. Navigate homepage
        driver.get("https://www.instagram.com/");

        //2. verify that the url of the homepage by checking if the homepage contains text "Don't have account?"
        String expectedtext ="Don't have an account? ";

    // before grabbing the html code of the page, wait 1 sec.
        Thread.sleep(1000);

     String pageSourceCode = driver.getPageSource();


     Assert.assertTrue(pageSourceCode.contains(expectedtext));

        driver.quit(); // closes all open windows/tabs
      //  driver.close();// closes only current open window(tab), so the other windows(tabs) are not affected.
    }
}

