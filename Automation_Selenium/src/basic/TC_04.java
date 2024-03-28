/*Test_Case_08 (Use Relative XPATH)
// Steps
// 1. Launch Chrome browser.
// 3. Open DemoWebShop URL "http://demowebshop.tricentis.com/"
// 4. Click on the registration link using Relative XPATH.
// 5. Enter registration details using Relative XPATH.
// Gender, FirstName, LastName, Email, Password, ConfirmPassword. (Enter the password as -
password123)
// 6. Click on the register button using Relative XPATH.
// 7. Close the browser.*/
package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_04 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\chrom\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();

		 //3. Open DemoWebShop URL "http://demowebshop.tricentis.com/"
		 driver.get("http://demowebshop.tricentis.com/");
		 
		 //4. Click on the registration link using Relative XPATH.
		 WebElement registerLink = driver.findElement(By.xpath("//a[@href=\"/register\"]"));
	        registerLink.click();
	        
	     // 5. Enter registration details using Relative XPATH.
	        WebElement genderFemale = driver.findElement(By.xpath("//input[@id=\"gender-female\"]"));
		      genderFemale.click();
		      
		      WebElement firstName = driver.findElement(By.xpath("//input[@name=\"FirstName\"]"));
		        firstName.sendKeys("Swapnali");
		        
		        //Last Name
		        WebElement LastName = driver.findElement(By.xpath("//input[@id=\"LastName\"]"));
		        LastName.sendKeys("Shewale");
		        
		        //Email
		        WebElement Email = driver.findElement(By.xpath("//input[@id=\"Email\"]"));
		        Email.sendKeys("swapnalishewale999@gmmail.com");
		        
		        //password
		        WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		        password.sendKeys("password123");
		        
		        //confirm password
		        WebElement confirmPassword = driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]"));
		        confirmPassword.sendKeys("password123");
		        
		        //6. Click on the register button using CSS_SELECTOR
		        
		        WebElement registerButton = driver.findElement(By.xpath("//input[@value=\"Register\"]"));
		        registerButton.click();
		        
		        //. Close the browser.
		        driver.close();
		        
	}
	

}
