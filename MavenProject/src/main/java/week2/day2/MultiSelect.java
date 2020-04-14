package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		WebElement ele1s = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement ele1 = driver.findElementByXPath("//li[text()='Item 3']");
		Actions builder=new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(ele1s).clickAndHold(ele1).keyUp(Keys.CONTROL).perform();
	}

}
