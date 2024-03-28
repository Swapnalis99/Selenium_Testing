/*Test_Case_06 (Use CSS_SELECTOR)
# Steps
# 1. Launch Chrome browser.
# 2. Launch the URL for the selector.html page.
# 3. Click on the UserName text box by using CSS_SELECTOR and enter "TestUser"
# 4. Click on the Password text box by using CSS_SELECTOR and enter "SamplePassword@123"
# 5. Close the browser.*/
package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_03 {
    public static void main(String[] args) {
        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\chrom\\chromedriver-win64\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Launch the URL for the selector.html page
        driver.get("file:///C:/Users/swapn/Downloads/css_selector.html");

        // Click on the UserName text box and enter "TestUser"
        WebElement UserNameTextBox = driver.findElement(By.cssSelector("input[type=text]"));
        UserNameTextBox.sendKeys("TestUser");
        UserNameTextBox.sendKeys(Keys.ENTER);

        // Click on the Password text box and enter "SamplePassword@123"
        WebElement Password = driver.findElement(By.cssSelector("input[type=password]"));
        Password.sendKeys("SamplePassword@123");
    }
}

