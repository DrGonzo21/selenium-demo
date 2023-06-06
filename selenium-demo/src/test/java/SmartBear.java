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
        String cardType = randomCardType(); // Move cardType declaration here
        CardInfo cardInfo = randomCardInfo(cardType);
        String expectedCardNumber = cardInfo.getCardNumber();
        String cardNumber;
        String product = "MyMoney";
        String address = randomAddress();
        String zip = randomZipCode();
        String first = randomName();
        String city = randomValue("New York", "Los Angeles", "Chicago", "Houston", "Phoenix");
        String state = randomValue("LA", "NY", "AZ", "VA", "TX", "WA");
        String confirm = "New order has been successfully added.";
        cardType = randomCardType();
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
        driver.findElement(By.xpath("//a[contains(text(),'Order')]")).click();
        Thread.sleep(1000);
        String pageSource2 = driver.getPageSource();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys(randomNumber());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys(first);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys(address);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys(city);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys(state);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys(zip);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList" + cardType)).click();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys(cardInfo.getCardNumber());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys(expirationDate());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
        Thread.sleep(1000);
        String pageSource3 = driver.getPageSource();
        Assert.assertTrue(pageSource3.contains(confirm));
        driver.findElement(By.xpath("//a[contains(text(),'View all orders')]")).click();
        Thread.sleep(2000);

        WebElement firstRow = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]"));

        List<WebElement> columns = firstRow.findElements(By.tagName("td"));

        for (int i = 1; i < columns.size(); i++) {

            String expectedValue = "";

            switch (i) {
                case 1:
                    expectedValue = first;
                    String actualFirstName = columns.get(1).getText();
                    Assert.assertEquals(actualFirstName, expectedValue, "First name is incorrect");
                    break;
                case 2:
                    expectedValue = product;
                    String actualProduct = columns.get(2).getText();
                    Assert.assertEquals(actualProduct, expectedValue, "Product is incorrect");
                    break;
                case 4:
                    expectedValue = zip;
                    String actualZip = columns.get(8).getText();
                    Assert.assertEquals(actualZip, expectedValue, "Zipcode is incorrect");
                    break;
                case 5:
                    expectedValue = state;
                    String actualState = columns.get(7).getText();
                    Assert.assertEquals(actualState, state, "State is incorrect");
                    break;
                case 6:
                    expectedValue = expectedCardNumber;
                    String actualCardNo = columns.get(10).getText();
                    Assert.assertEquals(actualCardNo, expectedCardNumber, "Card Number is incorrect");
                    break;
            }
        }

        driver.quit();
    }

    public static String randomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        return String.valueOf(randomNumber);
    }

    public static String randomName() {
        String[] names = {"John", "Jane", "Michael", "Emily", "David", "Olivia"};
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }

    public static String randomAddress() {
        String[] streets = {"Main St", "Oak Ave", "Maple Rd", "Cedar Ln", "Elm St"};
        Random random = new Random();
        return random.nextInt(1000) + 1 + " " + streets[random.nextInt(streets.length)];
    }

    public static String randomValue(String... values) {
        Random random = new Random();
        return values[random.nextInt(values.length)];
    }

    public static String randomZipCode() {
        Random random = new Random();
        return String.format("%05d", random.nextInt(100000));
    }

    public static CardInfo randomCardInfo(String cardType) {
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

        return new CardInfo(cardType, cardNumber.toString());
    }

    public static String randomCardType() {
        Random random = new Random();
        int cardTypeIndex = random.nextInt(3);
        return "_" + cardTypeIndex;
    }

    public static String expirationDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/yy");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 1);
        Date expirationDate = calendar.getTime();
        return dateFormat.format(expirationDate);
    }

    public static class CardInfo {
        private String cardType;
        private String cardNumber;

        public CardInfo(String cardType, String cardNumber) {
            this.cardType = cardType;
            this.cardNumber = cardNumber;
        }

        public String getCardType() {
            return cardType;
        }

        public String getCardNumber() {
            return cardNumber;
        }
    }
}



