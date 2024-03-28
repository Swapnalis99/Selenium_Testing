/*# 1. Launch Chrome browser.
# 2. Launch the URL "https://www.python.org/downloads/"
# 3. Capture the link text of all the links present on the page by using find_elements_by_tag_name
# 4. Print the total count of the links present on the page.
# 5. Create a list of the links that contain Python in the LINK_TEXT and Print the count of the Python
Links
# 6. Close the browser.*/

package seleniu_locators_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_04 {

	public static void main(String[] args) {
		
		//1. Launch Chrome browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\chrom\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
  //2. Launch the URL "https://www.python.org/downloads/"
        driver.get("https://www.python.org/downloads/");
        
        //3. Capture the link text of all the links present on the page by using find_elements_by_tag_name
          List <WebElement> Links = driver.findElements(By.tagName("a"));
          
          //4. Print the total count of the links present on the page.
	int count= Links.size();
	System.out.println("Total count of links: " +Links.size());
	
	
	
//5. Create a list of the links that contain Python in the LINK_TEXT and Print the count of the Python
	 for (int i=0; i<count; i++) {
     	String str =Links.get(i).getText();
     	System.out.println(str);
     }
}
}