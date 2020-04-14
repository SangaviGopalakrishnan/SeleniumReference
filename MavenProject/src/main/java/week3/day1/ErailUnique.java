package week3.day1;

import java.awt.List;

import java.awt.Window;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailUnique {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		boolean selected = driver.findElementByXPath("//input[@id='chkSelectDateOnly']").isSelected();
		if (selected) {
			driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();
		}
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("ED",Keys.TAB);		
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		ArrayList<String> arr = new ArrayList<String>();
		java.util.List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (int i = 0; i < rows.size(); i++) {
			WebElement element = rows.get(i);
			java.util.List<WebElement> findElements = element.findElements(By.tagName("td"));
			String text = findElements.get(1).getText();
			arr.add(text);
		}
		int size = arr.size();
		System.out.println(size);
		Set<String> set = new LinkedHashSet<String>(arr);
		int setsize = set.size();
		System.out.println(setsize);
	}

}
