package week4.day2;

import java.io.File;
import java.io.IOException;
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

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBus {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable notification");
		ChromeDriver driver = new ChromeDriver(option);	
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//input[@data-message='Please enter a source city']").sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ul[@class='autoFill']/li)[1]")).click();
		driver.findElementByXPath("//input[@data-message='Please enter a destination city']").sendKeys("Bangalore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ul[@class='autoFill']/li)[1]")).click();
		driver.findElement(By.xpath("//label[text()='Onward Date']")).click();;
		Date date = new Date(); // Get the current date
		DateFormat sdf = new SimpleDateFormat("dd"); //Get only the date (and not month, year, time etc)
		String today = sdf.format(date);
		driver.findElementByXPath("(//td[text()='"+today+"'])[2]").click();;
		driver.findElementByXPath("//button[text()='Search Buses']").click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//label[@for='dtAfter 6 pm'])[1]")).click();
		driver.findElementByXPath("(//label[@for='bt_SLEEPER'])[1]").click();
		driver.findElementByLinkText("Seats Available").click();
		String text = driver.findElementByXPath("(//div[@class='seat-left m-top-30'])[1]").getText();
		System.out.println("No of seats available --> "+text);
		driver.findElement(By.xpath("(//div[text()='View Seats'])[1]")).click();
		driver.findElement(By.xpath("(//div[text()='HIDE SEATS'])[1]")).click();
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='seat-left m-top-30']"));
		for (int i = 1; i <= list.size(); i++) {
			String text2 = driver.findElement(By.xpath("(//div[@class='seat-left m-top-30'])["+i+"]")).getText();
			if(text.equals(text2)) {
				driver.findElement(By.xpath("(//div[text()='View Seats'])["+i+"]")).click();
				Thread.sleep(2000);
				File src = driver.getScreenshotAs(OutputType.FILE);
				File dest = new File("./snaps/bus["+i+"].png");
				FileUtils.copyFile(src, dest);
				driver.findElement(By.xpath("(//div[text()='HIDE SEATS'])["+i+"]")).click();
			}
		}
	}
}