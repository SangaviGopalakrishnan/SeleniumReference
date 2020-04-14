package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Radio {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		boolean enabled = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[1]/div/div/label").isEnabled();
		if(enabled) {
			driver.findElementById("yes").click();
		}
		List<WebElement> tags = driver.findElementsByXPath("//label[text()='Find default selected radio button']/following::label[contains(@for,'hecked')]");
		for (WebElement string : tags) {
			String attribute = string.findElement(By.tagName("input")).getAttribute("value");
			System.out.println(string.getText());
		}
		boolean displayed = driver.findElementByXPath("(//label[@for='java'])[3]").isDisplayed();
		if(displayed) {
			boolean selected = driver.findElementByXPath("(//input[@name='age'])[1]").isSelected();
			if(!selected)
				driver.findElementByXPath("(//input[@name='age'])[1]").click();
		}
	}

}
