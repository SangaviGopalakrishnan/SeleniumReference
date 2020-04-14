package assignments.QueueEntry;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateChatQueueEntry extends CommonQueueEntryCode{
	
	@Test
	public void ChatQueueEntry() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.findElementByXPath("(//div[@class='container-fluid wizard-container'])[3]/a").click();
		no = driver.findElementByXPath("//input[@id='chat_queue_entry.number']").getAttribute("value");
		System.out.println(no);
		driver.findElementByXPath("//button[@id='sysverb_insert']").click();
		Thread.sleep(5000);
		WebElement dropdown = driver.findElementByXPath("//select[@class='form-control default-focus-outline']");
		Select option = new Select(dropdown);
		option.selectByVisibleText("Number");
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(no,Keys.ENTER);
		driver.findElementByXPath("//a[text()='"+no+"']").click();
		driver.findElementByXPath("//input[@id='chat_queue_entry.short_description']").sendKeys("updated",Keys.ENTER);
		driver.findElementByXPath("//button[@id='sysverb_update']").click();
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(no,Keys.ENTER);
		boolean displayed = driver.findElementByXPath("//td[text()='updated']").isDisplayed();
		if(displayed) {
			System.out.println("Updated");
		}else {
			System.out.println("Not updated");
		}
	}

}
