package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Hyperlink {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.findElementByPartialLinkText("Go to Home Page").click();
		driver.navigate().back();
		driver.findElementByLinkText("Find where am supposed to go without clicking me?").click();
		driver.navigate().back();
		driver.findElementByLinkText("Verify am I broken?").click();
		String text = driver.findElementByTagName("h1").getText();
		if (text.contains("HTTP Status 404 – Not Found")) {
			System.out.println("Yes broken");
		} else {
			System.out.println("Not broken");
		}
		driver.navigate().back();
		driver.findElementByXPath("(//a[text()='Go to Home Page'])[2]").click();
	}

}
