package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DeleteLead {
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
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[2]").click();
//		driver.findElementByXPath("//input[@class='x-form-text x-form-field']").sendKeys("1 212-681-3029");
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]");
		Thread.sleep(3000);
		String text = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
		System.out.println(text);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		driver.findElementByLinkText("Delete").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("((//div[@class='x-form-element'])/input)[13]").sendKeys(text);;
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		// how to get the message value
		String text2 = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		System.out.println(text2);
		if(text2.contains("No records to display")) {
			System.out.println("Delete successful");
		}else {
			System.out.println("Not succesful");
		}
		driver.close();
	}

}
