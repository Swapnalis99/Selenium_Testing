// 1. Launch Chrome browser.
// 2. Open DemoWebShop URL "D:\Course Material\Selenium\Training_Sele\demo-html\\xpath.html"
// 3. Click on each text box and enter appropriate details using Absolute XPATH.
// 4. Close the browser*/
package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_06 {

	public static void main(String[] args) {
	
		// 1. Launch Chrome browser.
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\chrom\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		// 2. Open DemoWebShop URL	 driver.get("http://demowebshop.tricentis.com/");
		 driver.get("file:///C:/Users/swapn/Downloads/xpath.html");
		 
		// 3. Click on each text box and enter appropriate details using Absolute XPATH.
		 driver.findElement(By.xpath("/html/body/div[1]/input[1]")).sendKeys("Swapnali");
		 driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys("Shewale");
		 driver.findElement(By.xpath("/html/body/div[2]/input[1]")).sendKeys("kennect");
		 driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("mummbai");
	}

}
