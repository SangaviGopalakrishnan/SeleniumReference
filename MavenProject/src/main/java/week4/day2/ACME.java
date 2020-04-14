package week4.day2;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ACME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementById("buttonLogin").click();
		WebElement truck = driver.findElementByXPath("//div[@class='dropdown']//following::i[@class='fa fa-truck']");
		Actions action = new Actions(driver);
		action.moveToElement(truck).perform();
		driver.findElementByLinkText("Search for Vendor").click();
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		driver.findElementByXPath("//button[text()='Search']").click();
		WebElement table = driver.findElementByXPath("//table[@class='table']");
		Map<String,String> map = new LinkedHashMap<String, String>();
		List<WebElement> row = table.findElements(By.tagName("tr"));
		for (int i = 1; i < row.size(); i++) {
			WebElement webElement = row.get(i);
			List<WebElement> col = webElement.findElements(By.tagName("td"));
			String vendor = col.get(0).getText();
			String country = col.get(4).getText();
			map.put(vendor, country);
		}
		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			if (entry.getKey().charAt(0) =='B') {
				System.out.println(entry.getKey()+"-->"+entry.getValue());
			} 
		}
		driver.findElementByLinkText("Log Out").click();
		driver.close();
	}

}
