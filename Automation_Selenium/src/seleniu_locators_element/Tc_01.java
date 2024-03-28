/*Test_Case_01
// Steps
// 1. Launch Chrome browser.
// 2. Launch the URL "http://demowebshop.tricentis.com//"
// 3. Mention XPATH to fetch all the links available under footer_menu
// 4. Capture all the footer links in a list
// 5. Iterate over a list and print all the items on the list.
// 6. Close the browser.*/


package seleniu_locators_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_01 {

	public static void main(String[] args) {
		// 1. Launch Chrome browser.	
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\chrom\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	     // 2. Launch the URL "http://demowebshop.tricentis.com//"
	        driver.get("http://demowebshop.tricentis.com//");
	     // 3. Mention XPATH to fetch all the links available under footer_menu
	     // 4. Capture all the footer links in a list
	        
	 List <WebElement> elements =      driver.findElements(By.xpath("//div[@class=\"footer-menu-wrapper\"]"));
	 
	// 5. Iterate over a list and print all the items on the list.
	 System.out.println("Text: ");
	 for(int i=0; i<elements.size(); i++)
	 {
		 String str = elements.get(i).getText();
		 System.out.println(str);
	 }
	 
	}
	

}
