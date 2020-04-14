package week4.day2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//input[@id='twotabsearchtextbox']").sendKeys("oneplus 7 pro mobiles",Keys.ENTER);
		String text = driver.findElementByXPath("//span[@class='a-price-whole']").getText();
		System.out.println("Price is-->"+ text);
		driver.findElementByXPath("//div[@class='a-section aok-relative s-image-fixed-height']/img").click();
		Set<String> set = driver.getWindowHandles();
		ArrayList<String> arr = new ArrayList<String>(set);
		driver.switchTo().window(arr.get(1));
		String ratings = driver.findElementById("acrCustomerReviewText").getText();
		System.out.println("Ratings-->"+ ratings);
		driver.findElementById("add-to-cart-button").click();
		Set<String> set1 = driver.getWindowHandles();
		ArrayList<String> arr1 = new ArrayList<String>(set);
		driver.switchTo().window(arr1.get(1));
		Thread.sleep(3000);
		String message = driver.findElementByXPath("(//h4[@class='a-alert-heading'])[3]").getText();
		if (message.contains("Added")) {
			System.out.println("Message displayed");
		} else {
			System.out.println("Message not displayed");
		}
		driver.findElementByXPath("(//input[@class='a-button-input'])[5]").click();
		Set<String> set2 = driver.getWindowHandles();
		ArrayList<String> arr2 = new ArrayList<String>(set);
		driver.switchTo().window(arr2.get(1));
		String title = driver.getTitle();
		if (title.contains("Amazon")) {
			System.out.println("Title correct");
		} else {
			System.out.println("Title is incorrect");
		}
		driver.findElementById("continue").click();
		String alert = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]").getText();
		if (alert.contains("email")) {
			System.out.println("Alert displayed");
		} else {
			System.out.println("Alert not displayed");
		}
		driver.quit();;
//		1. Launch URL: https://www.amazon.in/
//			2. Type "oneplus 7 pro mobiles" in Search Box and Enter
//			3. Print the price of the first resulting mobile
//			4. Click on the Mobile (First resulting) image
//			5. Switch to the new window
//			6. Print the number of customer ratings
//			7. Click 'Add to Cart'
//			8. Confirm "Added to Cart" text message appeared
//			9. Click to Proceed to Buy
//			10. Confirm the title is "Amazon Sign In"
//			11. Click Continue (without entering mobile number / email)
//			12. Verify the error message: Enter your email or mobile phone number
////			13. Close both browsers
	}

}
