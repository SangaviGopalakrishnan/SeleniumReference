package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Accounts").click();
		driver.findElementByLinkText("Find Accounts").click();
		driver.findElementByXPath("(//input[@name='accountName'])[2]").sendKeys("Credit Limited Account");
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		driver.findElementByLinkText("Credit Limited Account").click();
		driver.findElementByLinkText("Edit").click();
		Thread.sleep(3000);
		System.out.println(driver.findElementByXPath("//input[@id='accountName']").getAttribute("value"));
		System.out.println(driver.findElementByXPath("//textarea[@name='description']").getText());
		System.out.println(driver.getTitle());
	}
}
