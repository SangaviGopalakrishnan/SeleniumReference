package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByLinkText("Email").click();
		//		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("abc@gmail.com");
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		Thread.sleep(3000);
		String text = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]").getText();
		System.out.println(text);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		String title = driver.getTitle();
		if (title.contains("Duplicate")) {
			System.out.println("correct");
		} else {
			System.out.println("not correct");
		}
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		String text2 = driver.findElementById("viewLead_firstName_sp").getText();
		if (text.equals(text2)) {
			System.out.println("Duplicate");
		} else {
			System.out.println("Not Duplicate");
		}
		driver.close();
	}

}
