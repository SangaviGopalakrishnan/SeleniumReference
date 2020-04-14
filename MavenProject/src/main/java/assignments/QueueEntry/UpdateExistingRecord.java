package assignments.QueueEntry;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class UpdateExistingRecord extends CommonQueueEntryCode{
	
	@Test
	public void ChatQueueEntry() throws InterruptedException {		
		WebElement dropdown = driver.findElementByXPath("//select[@class='form-control default-focus-outline']");
		Select option = new Select(dropdown);
		option.selectByVisibleText("Task type");
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("ticket",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElementByXPath("(//a[@class='linked formlink'])[1]").click();
		String no1 = driver.findElementByXPath("//input[@id='ticket.number']").getAttribute("value");
		System.out.println(no1);
		WebElement dropdownstate = driver.findElementByXPath("//select[@id='ticket.state']");
		Select option1 = new Select(dropdownstate);
		option1.selectByVisibleText("Work in Progress");
		Thread.sleep(5000);
		driver.findElementByXPath("//button[@id='sysverb_update']").click();
		Thread.sleep(3000);
		option.selectByVisibleText("Number");	
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(no1,Keys.ENTER);
		String text = driver.findElementByXPath("(//td[@class='vt'])[3]").getText();
		System.out.println(text);
		if (text.contains("Progress")) {
			System.out.println("Existing record Updated");
		} else {
			System.out.println("Existing record Not Updated");
		}
	}

}
