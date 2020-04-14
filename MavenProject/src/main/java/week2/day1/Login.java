package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		ChromeOptions obj = new ChromeOptions();
		obj.addArguments("--disable-notification");
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("SSS");
		driver.findElementById("createLeadForm_firstName").sendKeys("Sangavi");
		driver.findElementById("createLeadForm_lastName").sendKeys("Gopalakrishnan");
		
		WebElement dropdown = driver.findElementById("createLeadForm_dataSourceId");
		Select options = new Select(dropdown);
		options.selectByVisibleText("Partner");
		List<WebElement> ddvalues = options.getOptions();
		for (WebElement webElement : ddvalues) {
			System.out.println(webElement.getText());
		}
//		driver.findElementById("createLeadForm_companyName").clear();
//		options.getFirstSelectedOption();
		/*String title = driver.getTitle();
		System.out.println(title);
		driver.findElementByClassName("smallSubmit").click();
		driver.close();*/
	}

}
