package week2.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.functions.Rows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindOppurtunites {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElementByXPath("//input[@id='username']").sendKeys("Demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@value='Login']").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Opportunities").click();
		driver.findElementByXPath("//div[@class='frameSectionBody']//li[3]/a").click();
		WebElement table = driver.findElementByXPath("//table[@class='x-grid3-row-table']");
		List<WebElement> row = table.findElements(By.tagName("tr"));
		ArrayList<String> list = new ArrayList<String>();
		System.out.println(row.size());
		for (int i = 1; i <= row.size(); i++) {
			String text = driver.findElementByXPath("((//div[@class='x-grid3-cell-inner x-grid3-col-salesOpportunityId'])["+i+"]/a)").getText();
			list.add(text);
			System.out.println(text);
		}
		String title = driver.getTitle();
		if (title.contains("Find Opportunities")) {
			System.out.println("Title correct");
		} else {
			System.out.println("Title wrong");
		}
		driver.close();
	}

}
