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

public class LeafGroundWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement table = driver.findElementById("table_id");
		java.util.List<WebElement> rows = table.findElements(By.tagName("tr"));
		ArrayList<String> arr= new ArrayList<String>();
		for (int i = 0; i < rows.size(); i++) {
			arr.add(rows.get(i).getText());
		}
		int rowsize = rows.size();
		java.util.List<WebElement> cols = table.findElements(By.tagName("td"));
		ArrayList<String> arr1= new ArrayList<String>();
		for (int i = 0; i < cols.size(); i++) {
			arr1.add(cols.get(i).getText());
		}
		int colsize = cols.size();
		String text = driver.findElementByXPath("//*[@id=\"table_id\"]/tbody/tr[3]/td[2]").getText();
		System.out.println(text);
		int min = 0;
		for (int i = 2; i <= rowsize; i++) {
		WebElement findElement = driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+(i)+"]/td[2]"));
			int no =Integer.parseInt(findElement.getText().replace('%', '0'))/10;
			if( i == 2) {
				min = no;
			}else {
				if(no<min)
					min = no;
			}

		}
		System.out.println(min);
		for(int i=2;i<=rowsize;i++) {
			WebElement findElement = driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+(i)+"]/td[2]"));
			int no =Integer.parseInt(findElement.getText().replace('%', '0'))/10;
			if(Integer.toString(min).equals(Integer.toString(no))){
				WebElement new1 = driver.findElementByXPath("//*[@id=\"table_id\"]/tbody/tr["+(i)+"]/td[3]/input");
				new1.click();
			}
		}
	}

}
