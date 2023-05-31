package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.Random;

import static basics.DUOTIFY.RandomUsernameGenerator.generateRandomUsername;

public class DUOTIFY {
    public static void main(String[] args) throws InterruptedException {

        String username = generateRandomUsername();
        String email = generateRandomEmail();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://duotify.us-east-2.elasticbeanstalk.com");

        String expectedText = "Welcome to Duotify!";
        String expectedText1 = "Johnny Boy";
        String expectedText2 = "You Might Also Like";

        String pageSourceCode = driver.getPageSource();

        Assert.assertTrue(pageSourceCode.contains(expectedText));
        Thread.sleep(2000);
        driver.findElement(By.id("hideLogin")).click();
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("firstName")).sendKeys("Johnny");
        driver.findElement(By.id("lastName")).sendKeys("Boy");
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("email2")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.id("password2")).sendKeys("password");
        Thread.sleep(2000);
        driver.findElement(By.name("registerButton")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://duotify.us-east-2.elasticbeanstalk.com/browse.php?");
        String updatedPageSource = driver.getPageSource();
        Assert.assertTrue(updatedPageSource.contains(expectedText1));
        driver.findElement(By.id("nameFirstAndLast")).click();
        String updatedPageSource1 = driver.getPageSource();
        Assert.assertTrue(updatedPageSource1.contains(expectedText1));
        Thread.sleep(1000);
        driver.findElement(By.id("rafael")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(),"http://duotify.us-east-2.elasticbeanstalk.com/register.php");
        driver.findElement(By.id("loginUsername")).sendKeys(username);
        driver.findElement(By.id("loginPassword")).sendKeys("password");
        Thread.sleep(1000);
        driver.findElement(By.name("loginButton")).click();
        Thread.sleep(1000);
        String updatedPageSource2 = driver.getPageSource();
        Assert.assertTrue(updatedPageSource2.contains(expectedText2));
        driver.findElement(By.id("nameFirstAndLast")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("rafael")).click();
        driver.quit();


    }
    public static String generateRandomEmail() {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String[] domains = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com"};

        StringBuilder email = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            email.append(characters.charAt(random.nextInt(characters.length())));
        }

        email.append('@').append(domains[random.nextInt(domains.length)]);

        return email.toString();
    }
    public class RandomUsernameGenerator {

        public static String generateRandomUsername() {
            String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
            StringBuilder username = new StringBuilder();
            Random random = new Random();

            for (int i = 0; i < 8; i++) {
                username.append(characters.charAt(random.nextInt(characters.length())));
            }

            return username.toString();
        }
    }
}


