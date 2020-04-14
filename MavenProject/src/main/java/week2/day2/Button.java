package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Button {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.findElementById("home").click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println(driver.findElementByXPath("//button[@id='position']").getLocation());
		System.out.println(driver.findElementByXPath("//button[@id='color']").getCssValue("background-color"));
		System.out.println(driver.findElementByXPath("//button[@id='size']").getSize());
	}

}
