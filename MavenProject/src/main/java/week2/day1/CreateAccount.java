package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account23");
		driver.findElementByXPath("//textarea[@name='description']").sendKeys("Selenium Automation Tester");
		driver.findElementByXPath("//input[@id='groupNameLocal']").sendKeys("Sangavi");
		driver.findElementByXPath("//input[@id='officeSiteName']").sendKeys("SSS Site");
		driver.findElementByXPath("(//input[@class='inputBox'])[5]").sendKeys("555989");//Collection
		WebElement industry = driver.findElementByName("industryEnumId");
		Select select=new Select(industry);
		select.selectByValue("IND_SOFTWARE");
		WebElement ownership = driver.findElementByName("ownershipEnumId");
		Select options=new Select(ownership);
		options.selectByVisibleText("S-Corporation");
		WebElement source = driver.findElementById("dataSourceId");
		Select source1 = new Select(source);
		source1.selectByValue("LEAD_EMPLOYEE");
		WebElement mci = driver.findElementById("marketingCampaignId");
		Select mci1 = new Select(mci);
		mci1.selectByIndex(6);
		WebElement state = driver.findElementById("generalStateProvinceGeoId");
		Select state1 = new Select(state);
		state1.selectByValue("TX");
		driver.findElementByXPath("//input[@value='Create Account']").click();
		driver.close();
	}
}
