package week3.day2;

import java.awt.List;

import java.awt.Window;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("FLIGHTS").click();;
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> arrlist = new ArrayList<String>(windowHandles);
		driver.switchTo().window(arrlist.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(arrlist.get(0)).close();;
		System.out.println(driver.findElement(By.xpath("//a[@class='mr-2 d-inline font-weight-bold']")).getAttribute("href"));
		
		/*1) Launch chrome and load URL - https://www.irctc.co.in/
			
			2) Click on FLIGHTS link
			
			3) Print the title of the Flights window
			
			4) Close the train search window (first window)
			
			5) Get the toll free (1800 110 139) from Flights window and print
			 */
	}

}
