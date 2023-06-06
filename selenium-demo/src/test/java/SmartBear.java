import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class SmartBear {


    public static void main(String[] args) throws InterruptedException {
        String address = randomAddress();
        String zip = randomZipCode();
        String first = randomName();
        String city = randomValue("New York", "Los Angeles", "Chicago", "Houston", "Phoenix");
        String state = randomValue("LA", "NY", "AZ", "VA", "TX", "WA");
        String confirm = "New order has been successfully added.";
        String cardType = randomCardType();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        String pageSource = driver.getPageSource();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        String pageSource1 = driver.getPageSource();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href=\"Process.aspx\"]")).click();
        Thread.sleep(1000);
        String pageSource2 = driver.getPageSource();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys(randomNumber());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys(first);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys(address);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys(city);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys(state);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys(zip);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList" + cardType)).click();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys(randomCardNumber(cardType));
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys(expirationDate());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
        Thread.sleep(1000);
        String pageSource3 = driver.getPageSource();
        Assert.assertTrue(pageSource3.contains(confirm));
        driver.findElement(By.xpath("//a[@href=\"Default.aspx\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("View all orders")).click();
        Thread.sleep(2000);

        WebElement firstRow = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]"));

        List<WebElement> columns = firstRow.findElements(By.tagName("td"));

        for (int i = 1; i < columns.size(); i++) {

            String expectedValue = "";

            switch (i) {
                case 1:
                    expectedValue = first;
                    String actualFirstName = driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[2]/td[2]")).getText();
                    Assert.assertEquals(actualFirstName, expectedValue, "First name is incorrect");
                    break;
                case 2:
                    String actualCity = driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[2]/td[7]")).getText();
                    Assert.assertEquals(actualCity,city,"City is incorrect");
                case 3:
                    expectedValue = zip;
                    String actualZip = driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[2]/td[9]")).getText();
                    Assert.assertEquals(actualZip,expectedValue,"Zipcode is incorrect");
                    break;
                case 4:
                    expectedValue = state;
                    String actualState = driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[2]/td[8]")).getText();
                    Assert.assertEquals(actualState,state,"State is incorrect");
                    break;

            }
        }

        driver.quit();
    }
    public static String randomNumber () {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        return String.valueOf(randomNumber);
    }
    public static String randomName () {
        String[] names = {"John", "Jane", "Michael", "Emily", "David", "Olivia"};
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }

    public static String randomAddress () {
        String[] streets = {"Main St", "Oak Ave", "Maple Rd", "Cedar Ln", "Elm St"};
        Random random = new Random();
        return random.nextInt(1000) + 1 + " " + streets[random.nextInt(streets.length)];
    }

    public static String randomValue (String...values){
        Random random = new Random();
        return values[random.nextInt(values.length)];
    }

    public static String randomZipCode () {
        Random random = new Random();
        return String.format("%05d", random.nextInt(100000));
    }

    public static String randomCardNumber(String cardType) {
        Random random = new Random();
        StringBuilder cardNumber = new StringBuilder();

        if (cardType.equals("0")) {
            cardNumber.append("4");
        } else if (cardType.equals("1")) {
            cardNumber.append("5");
        } else if (cardType.equals("2")) {
            cardNumber.append("3");
        }

        int length = (cardType.equals("2")) ? 15 : 16;
        for (int i = 1; i < length; i++) {
            cardNumber.append(random.nextInt(10));
        }

        return cardNumber.toString();
    }
    public static String randomCardType () {
        Random random = new Random();
        int cardTypeIndex = random.nextInt(3);
        return "_" + cardTypeIndex;
    }
    public static String expirationDate () {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/yy");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 1);
        Date expirationDate = calendar.getTime();
        return dateFormat.format(expirationDate);
    }
}



