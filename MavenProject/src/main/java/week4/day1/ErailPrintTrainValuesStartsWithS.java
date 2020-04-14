package week4.day1;

import java.awt.List;

import java.awt.Window;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailPrintTrainValuesStartsWithS {

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
		Map<Integer,String> map = new LinkedHashMap<Integer, String>();
		java.util.List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (int i = 0; i < rows.size(); i++) {
			WebElement element = rows.get(i);
			java.util.List<WebElement> findElements = element.findElements(By.tagName("td"));
			int trainno = Integer.parseInt(findElements.get(0).getText());
			String trainname = findElements.get(1).getText();
			map.put(trainno, trainname);
		}
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			String value = entry.getValue();
			char charAt = value.charAt(0);
			if(charAt == 'S') {
				System.out.println(entry.getKey()+"-->"+entry.getValue());
			}
		}
		

	}

}
