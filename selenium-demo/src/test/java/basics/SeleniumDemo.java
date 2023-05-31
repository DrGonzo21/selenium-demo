package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumDemo {

    public static void main(String[] args) {

        // ChromeDriver dr = new ChromeDriver();

        WebDriver driver = null;
        try {
            driver = new ChromeDriver(); // initiates browser session

            driver.get("https://www.duotech.io/"); //navigates to a specific url

            String expected = "Software QA Automation Engineer program | SDET | QA School | Software Testing";

            String actualTitle = driver.getTitle();

//        if(actualTitle.equalsIgnoreCase(expected)){
//            System.out.println("Test Passed");;
//
//        }else {
//            System.out.println("Test Failed");
//            System.out.println("Expected: " + expected);
//            System.out.println("Actual: " + actualTitle);
//        }

            Assert.assertEquals(actualTitle, expected); // actual, expected -> if you change the order then your test won't work as expected

        } finally {
            driver.quit(); //quit the broswer


        }
    }
}
