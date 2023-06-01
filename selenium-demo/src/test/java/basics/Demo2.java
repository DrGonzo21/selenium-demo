package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Demo2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        //1. Navigate homepage
        driver.get("https://www.nvidia.com/en-us/");

        //2. verify that the url of the homepage is "https://www.nvidia.com/en-us/"
        String expectedUrl = "https://www.nvidia.com/en-us/";

        String actualURL = driver.getCurrentUrl();
        System.out.println("The current URL is: " + actualURL);

        Assert.assertEquals(actualURL,expectedUrl);
        driver.quit();
    }
}
