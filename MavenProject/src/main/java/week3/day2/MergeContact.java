package week3.day2;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Contacts").click();
		driver.findElementByXPath("(//div[@class='frameSectionBody']//li[4])/a").click();
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif']/parent::a)").click();
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> arr = new ArrayList<String>(windowHandles);
		driver.switchTo().window(arr.get(1));
		driver.manage().window().maximize();
		driver.findElementByXPath("((//table[@class='x-grid3-row-table'])//a)[1]").click();
		driver.switchTo().window(arr.get(0));
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
		if(driver.getTitle().contains("View"))
			System.out.println("Title is correct");
		else
			System.out.println("Title is wrong");
		driver.close();
	}

}
