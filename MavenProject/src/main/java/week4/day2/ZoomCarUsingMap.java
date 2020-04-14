package week4.day2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ZoomCarUsingMap {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://www.zoomcar.com/chennai");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("Start your wonderful journey").click();
		driver.findElementByXPath("(//div[@class='items'])[2]").click();;
		driver.findElementByXPath("//button[@class='proceed']").click();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd");
		String format = sdf.format(date);
		int tomorrow = (Integer.parseInt(format)+1);
		driver.findElement(By.xpath("//div[text()="+tomorrow+"]"));
		driver.findElement(By.xpath("//button[@class='proceed']")).click();
//		6. Click on the Next Button
//		7. Confirm the Start Date and Click on the Done button
//		8. In the result page, capture the number of results displayed.
//		9. Find the highest priced car ride.
//		10. Click on the Book Now button for it.
//		11. Close the Browser.
	}
}