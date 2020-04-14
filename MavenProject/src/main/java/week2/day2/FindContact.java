package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FindContact {
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
		driver.findElementByLinkText("Contacts").click();
		driver.findElementByLinkText("Find Contacts").click();
		driver.findElementByXPath("(//span[@class='x-tab-strip-inner'])[3]").click();
		driver.findElementByName("emailAddress").sendKeys("abc@gmail.com");
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		driver.findElementById("viewContact_firstName_sp").getText();
		driver.findElementByLinkText("Edit").click();
		WebElement mc = driver.findElementById("addMarketingCampaignForm_marketingCampaignId");
		Select mc1 = new Select(mc);
		mc1.selectByValue("9000");
		driver.findElementByXPath("//input[@value='Add']").click();
		driver.findElementById("updateContactForm_departmentName").sendKeys("IT");
		driver.findElementByXPath("//input[@value='Update']").click();
		String text = driver.findElementById("viewContact_marketingCampaigns_sp").getText();
		if(text.contains("eCommerce"))
			System.out.println("Present");
		else
			System.out.println("Not present");
		String title = driver.getTitle();
		if (title.contains("Contact")) {
			System.out.println("Correct Title");
		}else
			System.out.println("Title Mismatch");
		driver.close();
	}

}
