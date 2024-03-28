/*# Steps
# 1. Launch Chrome browser.
# 2. Launch website "http://demowebshop.tricentis.com//"
# 3. Mention XPATH to fetch all the links available in the left navigator bar
# 4. Iterate over the list and print all the items on the list.
# 5. Close the browser.*/

package seleniu_locators_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_02 {

	public static void main(String[] args) {
		
// 1. Launch Chrome browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\chrom\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//Launch website "http://demowebshop.tricentis.com//"
        driver.get("http://demowebshop.tricentis.com//");
        
//3. Mention XPATH to fetch all the links available in the left navigator bar
        List <WebElement> elements =  driver.findElements(By.xpath("class=\"block block-category-navigation\"]"));
        System.out.println("Left  side list options  are: ");
        
      //4. Iterate over the list and print all the items on the list.
        for(int i=0; i<elements.size(); i++)
      {
   		 String str = elements.get(i).getText();
   		 System.out.println(str);
   		 
	}

}
}