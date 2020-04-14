package week3.day1;

import java.awt.List;

import java.awt.Window;
import java.util.*;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailSort {

	public static void main(String[] args) {
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

		//		Find all the train names using xpath and store it in a list
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		ArrayList<String> arr = new ArrayList<String>();
		java.util.List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (int i = 0; i < rows.size(); i++) {
			WebElement element = rows.get(i);
			java.util.List<WebElement> findElements = element.findElements(By.tagName("td"));
			String text = findElements.get(1).getText();
			arr.add(text);
		}
		ArrayList<String> newarr = new ArrayList<String>(arr);
		Collections.sort(newarr);
		int size = arr.size();
		int size2 = newarr.size();
		if (arr.equals(newarr)) {
			System.out.println("Both list are equal");
		}else
			System.out.println("Both list are not equal");
		//		Use Java Collections sort to sort it and then print it

	}

}
