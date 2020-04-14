package week2.day2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement one = driver.findElementById("dropdown1");
		Select s1= new Select(one);
		s1.selectByIndex(2);
		WebElement two = driver.findElementByName("dropdown2");
		Select s2= new Select(two);
		s2.selectByVisibleText("Appium");
		WebElement three = driver.findElementById("dropdown3");
		Select s3= new Select(three);
		s3.selectByValue("2");
		WebElement four = driver.findElementByXPath("//select[@class='dropdown']");
		Select s4= new Select(four);
		List<WebElement> options = s4.getOptions();
		System.out.println(options.size());
		
		driver.findElementByXPath("((//div[@class='example'])[5])/select").sendKeys("Loadrunner");
		
		WebElement op = driver.findElementByXPath("(//div[@class='example'])[6]");
		Actions builder = new Actions(driver);
		WebElement ele1 = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[6]/select/option[2]");
		WebElement ele2 = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[6]/select/option[4]");
		builder.keyDown(Keys.CONTROL).click(ele1).clickAndHold(ele2).keyUp(Keys.CONTROL).perform();
	}
}

