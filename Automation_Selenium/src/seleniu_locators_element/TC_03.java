/*Test_Case_03
// Steps
// 1. Launch Chrome browser.
// 2. Launch the URL "https://www.flipkart.com/"
// 3. Capture all the images available on the page by using find_elements_by_tag_name.
// 4. Print the total count of the images.
// 5. Iterate over a list and print all the items of the list. (Images 'alt' property name).
// 6. Close the browser.*/
package seleniu_locators_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_03 {

	public static void main(String[] args) {
		
		// 1. Launch Chrome browser.
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\chrom\\chromedriver-win64\\chromedriver.exe");

		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		  
		     // 2. Launch the URL "https://www.flipkart.com/"
		        driver.get("https://www.flipkart.com/");
		        
		     // 3. Capture all the images available on the page by using find_elements_by_tag_name.     
		        List<WebElement> image=  driver.findElements(By.tagName("img"));
		        
		     // 4. Print the total count of the images.
		        int  count = image.size();
		        System.out.println("the  count of  images are: "+count);
		        
		     // 5. Iterate over a list and print all the items of the list. (Images 'alt' property name).	        
		        for (int i=0; i<count; i++) {
		        	String str =image.get(i).getAttribute("alt");
		        	System.out.println(str);
		        }
	}

}
