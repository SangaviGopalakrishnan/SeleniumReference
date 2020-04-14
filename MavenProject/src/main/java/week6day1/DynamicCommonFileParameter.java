package week6day1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class DynamicCommonFileParameter {
	public ChromeDriver driver;
	
	public String excelName;
	
	@Parameters({"url","pwd","uname"})
	@BeforeMethod
	public void BeforeMeth(String url, String pwd, String uname) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(uname);
		driver.findElementById("password").sendKeys(pwd);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	}	
	@AfterMethod
	public void AfterMeth() {
		driver.close();
	}
	
	@DataProvider
	public String[][] getData() throws IOException {		
		//Reading from excel
		ReadExcel read = new ReadExcel();
		return read.getDataFromExcel(excelName);
		
//		Reading directly
//		String [][] data = new String[2][3];
//		
//		data[0][0]="TestLeaf";
//		data[0][1]="Ravi";
//		data[0][2]="br";
//		
//		data[1][0]="TestLeaf";
//		data[1][1]="Ram";
//		data[1][2]="hari";
//		
//		return data;
		
	}

}
