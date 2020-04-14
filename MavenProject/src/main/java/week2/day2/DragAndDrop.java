package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		WebElement Element2 = driver.findElementById("droppable");
		WebElement Element1 = driver.findElementById("draggable");
		Actions builder=new Actions(driver);
		builder.dragAndDrop(Element1, Element2).perform();
	}

}
