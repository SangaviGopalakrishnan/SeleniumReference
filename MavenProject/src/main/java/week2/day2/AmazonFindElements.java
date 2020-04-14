package week2.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazonFindElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("twotabsearchtextbox").sendKeys("USI punching bag");
		driver.findElementByXPath("//input[@value='Go']").click();
		driver.findElementByXPath("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left'])[4]").click();
		String attribute = driver.findElementByXPath("(((//div[@class='s-result-list s-search-results sg-row'])[last()])/div)[last()-1]").getAttribute("data-index");
		int size = (Integer.parseInt(attribute))+1;
		System.out.println(size);
		for (int j = 1; j <= size; j++) {
			String text = driver.findElementByXPath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[" + j + "]").getText();
			System.out.println(text);;
		}
		driver.close();
	}
}
