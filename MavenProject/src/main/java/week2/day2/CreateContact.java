package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
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
		driver.findElementByLinkText("Create Contact").click();
		driver.findElementById("firstNameField").sendKeys("Kavi");
		driver.findElementById("lastNameField").sendKeys("Krish");
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("S");
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("G");
		driver.findElementByName("departmentName").sendKeys("CSE");
		driver.findElementById("createContactForm_description").sendKeys("Creating Contact");
		driver.findElementById("createContactForm_primaryEmail").sendKeys("abc@gmail.com");
		WebElement state = driver.findElementById("createContactForm_generalStateProvinceGeoId");
		Select options = new Select(state);
		options.selectByVisibleText("New York");
		driver.findElementByXPath("//input[@value='Create Contact']").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("createContactForm_description").clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("enter text");
		driver.findElementByXPath("//input[@value='Update']").clear();
		System.out.println(driver.getTitle());
		driver.close();
	}

}
