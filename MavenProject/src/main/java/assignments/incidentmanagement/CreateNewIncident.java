package assignments.incidentmanagement;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateNewIncident {

	public static void main(String[] args) throws InterruptedException {
//		1. Launch ServiceNow application
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev87223.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		2. Login with valid credentials username as admin and password as India@123
		driver.switchTo().frame("gsft_main");
		driver.findElementByXPath("//label[text()='Password']/preceding::input[1]").sendKeys("admin");
		driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input")).sendKeys("jO5meNwhF6XL");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
//		3. Enter Incident in filter navigator and press enter"
		driver.findElementByXPath("//input[@name='filter']").sendKeys("Incident",Keys.ENTER);		
		
//		4. Click on Create new option and fill the manadatory fields
		Thread.sleep(5000);
		driver.findElementByXPath("(//div[text()='Create New'])[1]").click();
		driver.switchTo().frame("gsft_main");
		String id = driver.findElement(By.xpath("//input[@id='incident.number']")).getText();
		System.out.println(id);
//		driver.findElement(By.xpath("(//span[@class='icon icon-search'])[1]")).click();
//		Thread.sleep(5000);
//		Set<String> windowHandles = driver.getWindowHandles();
//		ArrayList<String> list = new ArrayList<String>(windowHandles);
//		driver.switchTo().window(list.get(1));
//		driver.findElement(By.xpath("(//input[@placeholder='Search'])[1]")).sendKeys("Vernon",Keys.ENTER);
//		driver.findElement(By.xpath("//a[text()='Vernon Engelman']")).click();
		driver.findElement(By.xpath("//input[@id='sys_display.incident.caller_id']")).sendKeys("Germaine Bruski",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys("SSSS_Test",Keys.ENTER);
//		driver.findElementByXPath("//span[@class='icon icon-lightbulb']").click();
		Thread.sleep(5000);
//		Set<String> windowHandles1 = driver.getWindowHandles();
//		ArrayList<String> list1 = new ArrayList<String>(windowHandles1);
//		driver.switchTo().window(list1.get(1));
//		driver.findElement(By.xpath("//a[text()='New employee hire']")).click();
//		Thread.sleep(5000);
//		driver.switchTo().window(list1.get(0));
//		driver.switchTo().frame("gsft_main");
		driver.findElementByXPath("(//button[text()='Submit'])[1]").click();
		
//		5. Verify the newly created incident
		WebElement dropdown = driver.findElementByXPath("//select[@class='form-control default-focus-outline']");
		Select option = new Select(dropdown);
		option.selectByVisibleText("Number");
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(id,Keys.ENTER);
		boolean enabled = driver.findElement(By.xpath("//a[text()='"+id+"']")).isDisplayed();
		if (enabled) {
			System.out.println("Incident created");
		} else {
			System.out.println("Incident not created");
		}
	}

}
