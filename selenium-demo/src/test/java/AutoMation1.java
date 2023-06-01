
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.Random;

import static basics.DUOTIFY.RandomUsernameGenerator.generateRandomUsername;

public class AutoMation1 {

    public static void main(String[] args) throws InterruptedException {




        String username = generateRandomUsername();
        String email = generateRandomEmail();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://duotify.us-east-2.elasticbeanstalk.com");
        String expectedText = "Welcome to Duotify!";
        String firtsLastName = "Hulk Hogan";
        String excpectedText1 = "You Might Also Like";
        String pageSourceCode = driver.getPageSource();

        Assert.assertTrue(pageSourceCode.contains(expectedText));
        Thread.sleep(2000);
        driver.findElement(By.id("hideLogin")).click();
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("firstName")).sendKeys("Hulk");
        driver.findElement(By.id("lastName")).sendKeys("Hogan");
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("email2")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.id("password2")).sendKeys("password");
        Thread.sleep(1000);
        driver.findElement(By.name("registerButton")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"http://duotify.us-east-2.elasticbeanstalk.com/browse.php?");
        String update = driver.getPageSource();
        Assert.assertTrue(update.contains(firtsLastName));
        driver.findElement(By.id("nameFirstAndLast")).click();
        String update1 = driver.getPageSource();
        Assert.assertTrue(update1.contains(firtsLastName));
        Thread.sleep(1000);
        driver.findElement(By.id("rafael")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(),"http://duotify.us-east-2.elasticbeanstalk.com/register.php");
        driver.findElement(By.id("loginUsername")).sendKeys(username);
        driver.findElement(By.id("loginPassword")).sendKeys("password");
        driver.findElement(By.name("loginButton")).click();
        Thread.sleep(2000);
        String update2 = driver.getPageSource();
        Assert.assertTrue(update2.contains(excpectedText1));
        driver.findElement(By.id("nameFirstAndLast")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("rafael")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(),"http://duotify.us-east-2.elasticbeanstalk.com/register.php");
        Thread.sleep(4000);
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

