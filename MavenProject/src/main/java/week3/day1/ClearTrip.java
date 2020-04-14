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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ClearTrip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("disable-notification");
		driver.findElementById("RoundTrip").click();
		driver.findElementByXPath("//input[@id='FromTag']").sendKeys("Chennai",Keys.TAB);
		driver.findElementByXPath("//input[@id='ToTag']").sendKeys("SXV",Keys.TAB);
		driver.findElementByXPath("//input[@id='DepartDate']").click();
		driver.findElementByXPath("//td[@class=' weekEnd ui-datepicker-days-cell-over  selected']").click();
		driver.findElementById("ReturnDate").clear();
		driver.findElementById("ReturnDate").click();
		driver.findElementByXPath("//td[@class=' weekEnd ui-datepicker-days-cell-over  selected']/following-sibling::td").click();
		WebElement ad = driver.findElementById("Adults");
		Select s1 = new Select(ad);
		s1.selectByVisibleText("2");
		WebElement ch = driver.findElementById("Childrens");
		Select s2 = new Select(ch);
		s1.selectByVisibleText("1");
		WebElement in = driver.findElementById("Infants");
		Select s3 = new Select(in);
		s1.selectByVisibleText("1");
		driver.findElementById("MoreOptionsLink").click();
		
		WebElement id = driver.findElementByXPath("//select[@id='Class']");
		Select s4= new Select(id);
		s4.selectByVisibleText("Premium Economy");
		driver.findElementById("AirlineAutocomplete").sendKeys("Emirates",Keys.TAB);
		driver.findElementById("SearchBtn").click();
		/*
		 * URL - https://www.cleartrip.com/
		1) Launch chrome and load URL, Add implicitwait
		2) Click Round trip
		3) Enter From city (Chennai) and TAB
		4) Enter To city (New York) and TAB
		5) Click Depart On (text box) 
		6) Select current date as Depart date
		7) Click Return On (text box) 
		8) Select tomorrow's date as return date
		9) Select Adults (as 2)
		10) Select Children (as 1)
		11) Select Infant (as 1)
		12) Click More Options (use id as locator)
		13) Select Premium Economy as Class of Travel
		14) Enter Preferred Airline as Emirates and TAB
		15) Click Search Flights 
		 */		

	}
}
