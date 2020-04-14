package week2.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class PractiseXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("//img[@src=\"/images/fieldlookup.gif\"]/parent::a").click();
		Set<String> win = driver.getWindowHandles();
		ArrayList<String> winarr = new ArrayList<String>(win); 
		driver.switchTo().window(winarr.get(1));
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		driver.switchTo().window(winarr.get(0));
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif']/parent::a)[2]").click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		ArrayList<String> arr1 = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(arr1.get(1));
		driver.manage().window().maximize();
		driver.findElementByXPath("(//table[@class='x-grid3-row-table']//a)[6]").click();
		driver.switchTo().window(arr1.get(0));
		driver.findElementByXPath("//a[@class='buttonDangerous']").click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String text = driver.findElementByXPath("(//span[text()='Company Name'])/following::span").getText();
		System.out.println(text);
		driver.close();
	}

}
