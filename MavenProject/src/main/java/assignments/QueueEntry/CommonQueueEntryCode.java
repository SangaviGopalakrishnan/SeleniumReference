package assignments.QueueEntry;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonQueueEntryCode {
	
	public static String no;
	public ChromeDriver driver;
	
	@BeforeMethod
	public void AssignmentLogin() throws InterruptedException {
		
//		1. Launch ServiceNow application
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://dev87223.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		2. Login with valid credentials username as admin and password as India@123
		driver.switchTo().frame("gsft_main");
		driver.findElementByXPath("//label[text()='Password']/preceding::input[1]").sendKeys("admin");
		driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input")).sendKeys("jO5meNwhF6XL");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElementByXPath("//input[@name='filter']").sendKeys("My work",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[text()='My Work'])[1]")).click();
		driver.switchTo().frame("gsft_main");
		Thread.sleep(5000);
	}

//	@AfterMethod
//	public void AssignmentLogout() {
//		driver.close();
//	}
}
