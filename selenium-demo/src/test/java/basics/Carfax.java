package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Carfax {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Step 1: Navigate to carfax.com
        driver.get("https://www.carfax.com/?partner=GPC_V&click=sem&utm_source=google&utm_medium=cpc&utm_campaign=71700000046181564&utm_term=p39963530967&gad=1&gclid=EAIaIQobChMIkdDLidW7_wIVPg-tBh1_HgIAEAAYASAAEgJZ7PD_BwE&gclsrc=aw.ds");
        Thread.sleep(2000);

        // Step 2: Click on Find a Used Car
        driver.findElement(By.xpath("//a[@class='button button--green outline']")).click();
        Thread.sleep(2000);

        // Step 3: Verify the page title contains the word "Used Cars"
        String confirm = "Used Cars";
        Assert.assertTrue(driver.getPageSource().contains(confirm));

        // Step 4: Choose "Tesla" for Make
        WebElement usedNewDropdown = driver.findElement(By.id("cfx-select-input-2652835483448415"));
        Select select = new Select(usedNewDropdown);
        select.selectByVisibleText("All Makes");
        new Select(driver.findElement(By.id("make_Tesla"))).selectByValue("Tesla");

        // Step 5: Verify that the Select Model dropdown box contains 4 current Tesla models
        String pageSource = driver.getPageSource();
        if (pageSource.contains("Model 3") && pageSource.contains("Model S")
                && pageSource.contains("Model X") && pageSource.contains("Model Y")) {
            Select modelSelect = new Select(driver.findElement(By.id("cfx-select-input-992731701677679")));
            modelSelect.selectByValue("Model S");
        }

        // Step 6: Enter the zip code 22182 and click Next
        driver.findElement(By.id("zipcode")).sendKeys("22182");
        driver.findElement(By.className("button ripple-container new-search-form__submit-button")).click();

        // Step 7: Verify that the page contains the text "Step 2 – Show me cars with"
        String step2 = new Select(driver.findElement(By.xpath("//h3[@class='searchForm-wrapper-header--lp']"))).toString();
        Assert.assertEquals(step2, "Step 2 - Show me cars with");
// Step 8: Check all 4 checkboxes
        driver.findElement(By.xpath("(//div[@class='checkbox-input_box'])[1]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("(//div[@class='checkbox-input_box'])[2]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("(//div[@class='checkbox-input_box'])[3]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("(//div[@class='checkbox-input_box'])[4]")).click();
        Thread.sleep(500);

// Step 9: Save the count of results from "Show me X Results" button
        String carMatches = driver.findElement(By.xpath("(//div[@class='ripple'])[2]")).getText();
        int resultCount = Integer.parseInt(carMatches.split(" ")[2]);

// Step 10: Click on "Show me X Results" button
        driver.findElement(By.xpath("//button[text()='Show me " + resultCount + " Results']")).click();
        Thread.sleep(2000);

// Step 11: Verify the results count by getting the actual number of results displayed on the page
        List<WebElement> results = driver.findElements(By.xpath("//h4[@class='srp-list-item-basic-info-model']"));
        Assert.assertEquals(results.size(), resultCount);

// Step 12: Verify that each result header contains "Tesla Model S"
        for (WebElement result : results) {
            Assert.assertTrue(result.getText().contains("Tesla Model S"));
        }

// Step 13: Get the price of each result and save them into a List in the order of their appearance
        List<WebElement> prices = driver.findElements(By.xpath("//span[@class='price-text']"));
        List<Double> pricesAsDouble = new ArrayList<>();

        for (WebElement price : prices) {
            String priceFixed = price.getText().replaceAll("[$,]", "");

            if (priceFixed.contains(" ")) {
                priceFixed = priceFixed.substring(0, priceFixed.indexOf(" "));
            }
            pricesAsDouble.add(Double.valueOf(priceFixed));
        }

// Step 14: Choose "Price - High to Low" option from the Sort By menu
        new Select(driver.findElement(By.xpath("//select[@id='srp-header-sort-select']"))).selectByValue("PRICE_DESC");

// Step 15: Verify that the results are displayed from high to low price
        List<WebElement> sortedPrices = driver.findElements(By.xpath("//span[@class='price-text']"));
        List<Double> sortedPricesAsDouble = new ArrayList<>();

        for (WebElement price : sortedPrices) {
            String priceFixed = price.getText().replaceAll("[$,]", "");

            if (priceFixed.contains(" ")) {
                priceFixed = priceFixed.substring(0, priceFixed.indexOf(" "));
            }
            sortedPricesAsDouble.add(Double.valueOf(priceFixed));
        }

        Assert.assertEquals(pricesAsDouble, sortedPricesAsDouble);

// Step 16: Choose "Mileage - Low to High" option from the Sort By menu
        new Select(driver.findElement(By.xpath("//select[@id='srp-header-sort-select']"))).selectByValue("MILEAGE_ASC");

// Step 17: Verify that the results are displayed from low to high mileage
        List<WebElement> mileageElements = driver.findElements(By.xpath("//span[@class='srp-list-item__basic-info-value']//strong"));
        List<Integer> mileageValues = new ArrayList<>();

        for (WebElement mileageElement : mileageElements) {
            String mileageText = mileageElement.getText().replaceAll("[^0-9]", "");

            if (!mileageText.isEmpty()) {
                int mileage = Integer.parseInt(mileageText);
                mileageValues.add(mileage);
            }
        }

        List<Integer> sortedMileageValues = new ArrayList<>(mileageValues);
        sortedMileageValues.sort(Comparator.naturalOrder());

        Assert.assertEquals(mileageValues, sortedMileageValues);

// Step 18: Choose "Year - New to Old" option from the Sort By menu
        new Select(driver.findElement(By.xpath("//select[@id='srp-header-sort-select']"))).selectByValue("YEAR_DESC");

// Step 19: Verify that the results are displayed from new to old year
        List<WebElement> yearElements = driver.findElements(By.xpath("//span[@class='srp-list-item__basic-info-value']//strong"));
        List<Integer> yearValues = new ArrayList<>();

        for (WebElement yearElement : yearElements) {
            String yearText = yearElement.getText().replaceAll("[^0-9]", "");

            if (!yearText.isEmpty()) {
                int year = Integer.parseInt(yearText);
                yearValues.add(year);
            }
        }

        List<Integer> sortedYearValues = new ArrayList<>(yearValues);
        sortedYearValues.sort(Comparator.reverseOrder());

        Assert.assertEquals(yearValues, sortedYearValues);

// Step 20: Close the driver
        driver.quit();
    }
}

