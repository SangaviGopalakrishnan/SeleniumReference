package week2.day2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		boolean enabled = driver.findElementByXPath("(//label[@for='java'])[1]").isEnabled();
		if (enabled) {
			driver.findElementByXPath("(((//div[@class='example'])[1])//input)[3]").click();
			driver.findElementByXPath("(((//div[@class='example'])[1])//input)[2]").click();
		}
		boolean enabled2 = driver.findElementByXPath("(//label[@for='java'])[2]").isEnabled();
		if (enabled2) {
			boolean selected = driver.findElementByXPath("((//div[@class='example'])[2])//input[1]").isSelected();
			if (selected) {
				System.out.println("Checkbox checked");
			} else {
				System.out.println("Checkbox not cecked");
			}
		} 
		boolean enabled3 = driver.findElementByXPath("(//label[@for='java'])[3]").isEnabled();
		if (enabled3) {	
			List<WebElement> findElements = driver.findElements(By.xpath("(//div[@class='example'])[3]//input"));
			Iterator<WebElement> iterator = findElements.iterator();
			while(iterator.hasNext()) {
				WebElement nextelement = iterator.next();
				boolean selected = nextelement.isSelected();
				if (selected) {
					nextelement.click();
				}
			}
			//			for (WebElement eachEle : findElements) {
			//				if(eachEle.isSelected()) {
			//					eachEle.click();
			//				}
			//			}
		}
		boolean enabled4 = driver.findElementByXPath("(//label[@for='java'])[4]").isEnabled();
		if (enabled4) {
			List<WebElement> findElements1 = driver.findElements(By.xpath("(//div[@class='example'])[4]//input"));
			Iterator<WebElement> iterator1 = findElements1.iterator();
			while(iterator1.hasNext()) {
				iterator1.next().click();
			}
		}
	}
}

