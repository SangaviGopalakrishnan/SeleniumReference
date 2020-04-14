package week2.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Myntra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable notification");
		ChromeDriver driver = new ChromeDriver(option);	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		driver.findElementByXPath("//input[@class='desktop-searchBar']").sendKeys("shirt",Keys.ENTER);
		driver.findElementByXPath("//span[@class='myntraweb-sprite filter-search-iconSearch sprites-search']").click();
		driver.findElementByXPath("//input[@class='filter-search-inputBox']").sendKeys("U.S. Polo Assn");
		driver.findElementByXPath("(//ul[@class='brand-list']//div)").click();
		WebElement elem = driver.findElementByXPath("//div[@class='sort-sortBy']");
		Actions ac = new Actions(driver);
		ac.moveToElement(elem).perform();
		driver.findElementByXPath("//input[@value='U.S. Polo Assn.']//following-sibling::div").click();
		ArrayList<String> arr = new ArrayList<String>();
		List<WebElement> list = driver.findElements(By.xpath("//li[@class='product-base']"));
		for (int i = 1; i<=list.size(); i++) {	
//			boolean text = driver.findElementByXPath("(//div[@class='product-price']/span["+i+"])/span[1]").isEnabled();
//			if(text) {
//				arr.add(driver.findElementByXPath("(//div[@class='product-price']/span["+i+"])/span[1]").getText());
//			}else {
				arr.add(driver.findElementByXPath("((//div[@class='product-price']/span[1]))["+i+"]").getText());
//			}
		}
		System.out.println(arr.size());
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		driver.close();
	}

}
