package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NTCreateAccount {

	public static void main(String[] args) {
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
		driver.findElementByLinkText("Create Account").click();
		WebElement currency = driver.findElementByName("currencyUomId");
		Select currency1 = new Select(currency);
		currency1.selectByValue("INR");
		driver.findElementByName("description").sendKeys("NRI Account");
		driver.findElementByXPath("//input[@id='groupNameLocal']").sendKeys("localname");
		driver.findElementByXPath("//input[@id='officeSiteName']").sendKeys("sitename");
		driver.findElementByXPath("//input[@id='annualRevenue']").sendKeys("54545");
		WebElement industry = driver.findElementByName("industryEnumId");
		Select industry1 = new Select(industry);
		industry1.selectByValue("IND_SOFTWARE");
		WebElement owner = driver.findElementByName("ownershipEnumId");
		Select owner1 = new Select(owner);
		owner1.selectByVisibleText("S-Corporation");
		WebElement source = driver.findElementByName("dataSourceId");
		Select source1 = new Select(source);
		source1.selectByValue("LEAD_EMPLOYEE");
		WebElement mc = driver.findElementByName("marketingCampaignId");
		Select mc1 = new Select(mc);
		mc1.selectByIndex(6);
		WebElement state = driver.findElementByName("generalStateProvinceGeoId");
		Select state1 = new Select(state);
		state1.selectByValue("TX");
		driver.findElementByXPath("//input[@value='Create Account']").click();
		System.out.println(driver.findElementByXPath("//li[@class='errorMessage']").getText());
 	}
}
