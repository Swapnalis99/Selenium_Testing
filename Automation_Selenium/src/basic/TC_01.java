/*Test_Case_05 (Use CSS_SELECTOR (Cascaded Style Sheet))
# Steps
# 1. Launch Chrome browser
# 2. Go to Google search.
# 3. Type Amazon in the search text box.
# 4. Click on the Amazon link using CSS_SELECTOR
# 5. Close the browser.*/
package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01 {

    public static void main(String[] args)  {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\chrom\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Go to Google search.
        driver.get("https://www.google.com/");
      

        // Type Amazon in the search text box.
        WebElement searchBox = driver.findElement(By.name("q")); // Changed to By.name("q")
        searchBox.sendKeys("Amazon");
        
        searchBox.sendKeys(Keys.ENTER);
     

        // Click on the Amazon link using CSS_SELECTOR
        WebElement element = driver.findElement(By.cssSelector("a[href='https://www.amazon.com/']")); // Corrected CSS selector
        element.click();

        // Close the browser.
        driver.close();
    }




    		   
    	
	}


