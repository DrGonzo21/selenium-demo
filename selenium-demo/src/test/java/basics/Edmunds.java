package basics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Edmunds {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        try {
            driver.get("https://www.edmunds.com/");

            // Perform initial search steps
            driver.findElement(By.xpath("//a[@href='/inventory/srp.html?inventorytype=used%2Ccpo']")).click();
            driver.findElement(By.cssSelector("input[name='zip']")).sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE, "22031", Keys.ENTER);

            // Select make and model
            Select makeSelect = new Select(driver.findElement(By.id("usurp-make-select")));
            makeSelect.selectByVisibleText("Tesla");
            Thread.sleep(1500);
            Select modelSelect = new Select(driver.findElement(By.id("usurp-model-select")));
            modelSelect.selectByValue("Model 3");
            Thread.sleep(1500);

            // Set minimum year and select "Only show local listings" option
            driver.findElement(By.cssSelector("input[name='min-value-input']")).sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE, "2020", Keys.ENTER);
            driver.findElement(By.xpath("(//span[@class='name ml-0_5'])[2]")).click();


            // Get search results count
            Thread.sleep(2000);
            WebElement resultsElement = driver.findElement(By.cssSelector("span.inventory-count"));
            String results = resultsElement.getText();
            System.out.println("Results: " + results);
            int resultsCount = Integer.parseInt(results.replaceAll("[^0-9]", ""));
            System.out.println("Results Count: " + resultsCount);
            Assert.assertTrue(resultsCount > 0, "Search results are not found");

            // Check if at least one listing contains "Model 3"
            List<WebElement> listings = driver.findElements(By.cssSelector("a.usurp-inventory-card-vdp-link"));
            boolean atLeastOneListingContainsModel3 = listings.stream()
                    .map(WebElement::getText)
                    .anyMatch(listingText -> listingText.contains("Model 3"));
            Assert.assertTrue(atLeastOneListingContainsModel3, "No listing contains 'Model 3'");

            // Get model years and check if all are within the range
            Thread.sleep(1500);
            List<String> modelYears = listings.stream()
                    .map(listing -> listing.findElement(By.xpath("//div[@class='size-16 font-weight-bold mb-0_5 text-blue-50']")))
                    .map(WebElement::getText)
                    .map(listingText -> listingText.replaceAll("\\D", ""))
                    .filter(year -> !year.isEmpty())
                    .toList();
            boolean allModelYearsWithinRange = modelYears.stream()
                    .map(yearText -> Integer.parseInt(yearText.substring(0, 4))) // Extract the first four characters as the year
                    .allMatch(year -> year >= 2020 && year <= 2023);
            Assert.assertTrue(allModelYearsWithinRange, "Not all model years are within the range of 2020 to 2023");

            // Select sorting option
            Select sortBy = new Select(driver.findElement(By.id("sort-by")));
            sortBy.selectByValue("price:asc");
            Thread.sleep(2000);

            List<WebElement> carPrices = driver.findElements(By.xpath("//span[@class='heading-3']"));
            List<Integer> prices = carPrices.stream()
                    .map(WebElement::getText)
                    .map(priceText -> priceText.replaceAll("\\D", "")) // Remove non-digit characters
                    .map(Integer::parseInt)
                    .toList();

            boolean pricesInOrder = IntStream.range(0, prices.size() - 1)
                    .allMatch(i -> prices.get(i) <= prices.get(i + 1));

            Assert.assertTrue(pricesInOrder, "Prices are not in ascending order");

            // Select sorting option
            Select sortHigh = new Select(driver.findElement(By.id("sort-by")));
            sortHigh.selectByValue("price:desc");
            Thread.sleep(2000);

            List<WebElement> carPrices1 = driver.findElements(By.xpath("//span[@class='heading-3']"));

            boolean pricesInDescendingOrder = IntStream.range(0, carPrices1.size() - 1)
                    .allMatch(i -> {
                        String price1 = carPrices1.get(i).getText();
                        String price2 = carPrices1.get(i + 1).getText();
                        return price2.compareTo(price1) <= 0;
                    });

            Assert.assertTrue(pricesInDescendingOrder, "Prices are not in descending order");

            Select milage = new Select(driver.findElement(By.id("sort-by")));
            milage.selectByValue("mileage:asc");

            List<WebElement> mileageElements = driver.findElements(By.xpath("//div[@class='key-point size-14 d-flex align-items-baseline mt-0_5 col-12']//span[@title='Car Mileage']"));

            Thread.sleep(2000);

            List<Integer> mileageValues = new ArrayList<>();

            // Retrieve the mileage values from the web page
            driver.findElements(By.xpath("//a[@data-linkname='vehicle-listing']//div[@class='mileage']"))
                    .forEach(element -> {
                        String mileageText = element.getText().replaceAll("\\D", "");
                        int mileage = Integer.parseInt(mileageText);
                        mileageValues.add(mileage);
                    });

            // Verify if mileage values are sorted in ascending order
            List<Integer> expectedMileageValues = new ArrayList<>(mileageValues);
            expectedMileageValues.sort(Comparator.naturalOrder());

            Assert.assertEquals(mileageValues, expectedMileageValues);
            List<WebElement> carList = driver.findElements(By.xpath("//a[@class='usurp-inventory-card-vdp-link']"));

            // Scroll to the last element
            int lastIndex = carList.size() - 1;
            WebElement lastElement = carList.get(lastIndex);

            // Store information from the last element
            String lastElementText = lastElement.getText();
            String lastElementHref = lastElement.getAttribute("href");

            // Click on the last element
            lastElement.click();

            // Retrieve the mileage and cost on the new page
            WebElement mileageElement = driver.findElement(By.xpath("(//div[@class='pr-0 font-weight-bold text-right ml-1 col'])[1]"));
            String lastElementMileageText = mileageElement.getText();
            int lastElementMileage = Integer.parseInt(lastElementMileageText.replaceAll("\\D", ""));

            WebElement costElement = driver.findElement(By.xpath("//span[@data-testid='vdp-price-row']"));
            String lastElementCostText = costElement.getText();
            int lastElementCost = Integer.parseInt(lastElementCostText.replaceAll("\\D", ""));

            // Compare the values
            // Example: Print the comparison result
            System.out.println("Last Element Text: " + lastElementText);
            System.out.println("Last Element Href: " + lastElementHref);
            System.out.println("Last Element Mileage: " + lastElementMileage);
            System.out.println("Last Element Cost: " + lastElementCost);
            Thread.sleep(5000);



        } finally {
           driver.quit();
        }
    }
}

