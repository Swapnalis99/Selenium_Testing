package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_05 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\chrom\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 //open flipkart 
		 driver.get("https://www.flipkart.com/");
		 
		 //Open the Elctronic section using xpath
		 WebElement Electronics = driver.findElement(By.xpath("//div[@class=\"_1wE2Px\"]"));
	       Electronics.click();
	  	 WebElement BluetoothSpeaker = driver.findElement(By.xpath("//a[@href=\"/audio-video/speakers/pr?sid=0pm%2C0o7&otracker=categorytree&p%5B%5D=facets.features%255B%255D%3DBluetooth&p%5B%5D=facets.price_range.from%3D599&p%5B%5D=facets.price_range.to%3DMax&p%5B%5D=facets.type%255B%255D%3DTower%2BSpeaker&p%5B%5D=facets.type%255B%255D%3DCar%2BSpeaker&p%5B%5D=facets.type%255B%255D%3DConference%2BSpeaker&p%5B%5D=facets.type%255B%255D%3DGaming%2BSpeaker&p%5B%5D=facets.type%255B%255D%3DHome%2BAudio%2BSpeaker&p%5B%5D=facets.type%255B%255D%3DLaptop%252FDesktop%2BSpeaker&p%5B%5D=facets.type%255B%255D%3DMobile%252FTablet%2BSpeaker&p%5B%5D=facets.type%255B%255D%3DPA%2BSpeaker&p%5B%5D=facets.type%255B%255D%3DParty%2BSpeaker&p%5B%5D=facets.type%255B%255D%3DSmart%2BSpeaker&fm=neo%2Fmerchandising&iid=M_fe7078e4-8546-460f-b77e-de5c26970950_1_372UD5BXDFYS_MC.0NUBZMA2FSEI&otracker=hp_rich_navigation_5_1.navigationCard.RICH_NAVIGATION_Electronics~Audio~Bluetooth%2BSpeakers_0NUBZMA2FSEI&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_5_L2_view-all&cid=0NUBZMA2FSEI]"));
	  	BluetoothSpeaker.click();
	}
}