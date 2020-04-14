package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/mouseOver.html");
		driver.manage().window().maximize();
		WebElement Element1 = driver.findElementByClassName("btnMouse");
		Actions builder = new Actions(driver);
		builder.moveToElement(Element1).perform();
		driver.findElementByXPath("//a[text()='Selenium']").click();
	}

}
