/*Test_Case_06
// Steps
// 1. Launch Chrome browser.
// 2. Launch the demo.html page.
// 3. Find text boxes with the attribute name as 'fname'.
// 4. Print the count of total text boxes.
// 6. Close the browser.*/
package seleniu_locators_element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_06 {

	public static void main(String[] args) {
		//1. Launch Chrome browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\chrom\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
	}

}
