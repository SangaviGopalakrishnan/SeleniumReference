package week4.day2;

import java.util.ArrayList;
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

public class ZoomCar {

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
		driver.findElement(By.xpath("(//div[@class='days']/div)[2]")).click();
		String enterdate = driver.findElement(By.xpath("(//div[@class='days']/div)[2]/div")).getText();
		driver.findElement(By.xpath("//button[@class='proceed']")).click();
		String confdate = driver.findElement(By.xpath("//div[@class=\"days\"]/div/div")).getText();
		if (enterdate.contains(confdate)) {
			System.out.println("Date correct");
		}
		driver.findElement(By.xpath("//button[@class='proceed']")).click();
		Set<Integer> set = new TreeSet<Integer>();
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='car-list-layout']/div"));
		System.out.println(list.size());
		for (int i = 1; i <= list.size(); i++) {
			String priceval = driver.findElement(By.xpath("(//div[@class='price'])["+i+"]")).getText().substring(2);
			if (priceval.contains(",")) {
				priceval=priceval.replace(",","");
				int val = Integer.parseInt(priceval);
				set.add(val);
			}else {
				int val = Integer.parseInt(priceval);
				set.add(val);
			}
		}
		ArrayList<Integer> arrlist = new ArrayList<Integer>(set);
		Integer highestprice = arrlist.get(arrlist.size()-1);
		System.out.println("Highest price is-->"+highestprice);
		for (int i = 1; i <= list.size(); i++) {
			String conftext = driver.findElement(By.xpath("(//div[@class='price'])["+i+"]")).getText().substring(2);
			int confint = 0;
			if (conftext.contains(",")) {
				conftext=conftext.replace(",","");
				confint = Integer.parseInt(conftext);
			}else {
				confint = Integer.parseInt(conftext);
			}
			if (highestprice == confint) {
				System.out.println(confint);
				driver.findElement(By.xpath("(//button[@name='book-now'])["+i+"]")).click();
				return;
			}else{
				confint = 0;
			}
		}
		driver.close();
	}
}