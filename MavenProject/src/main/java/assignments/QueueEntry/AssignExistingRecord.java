package assignments.QueueEntry;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AssignExistingRecord extends CommonQueueEntryCode{
	
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
		option1.selectByVisibleText("Closed Complete");
		Thread.sleep(2000);
		
		WebElement dropdownpriority = driver.findElementByXPath("//select[@id='ticket.priority']");
		Select option2 = new Select(dropdownpriority);
		option2.selectByVisibleText("2 - High");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='sys_display.ticket.assignment_group']")).sendKeys("IT Securities",Keys.ENTER);
		driver.findElementByXPath("//button[@id='sysverb_update']").click();
		
		option.selectByVisibleText("Number");
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(no1,Keys.ENTER);
		String text = driver.findElementByXPath("(//td[@class='vt'])[3]").getText();
		System.out.println(text);
		if (text.contains("Complete")) {
			System.out.println("Assigned Existing record");
		} else {
			System.out.println("Existing record Not Assigned");
		}
	}
}
