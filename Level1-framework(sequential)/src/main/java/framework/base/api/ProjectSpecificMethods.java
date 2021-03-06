package framework.base.api;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import framework.utils.ReadExcel;

public class ProjectSpecificMethods {
	public static ChromeDriver driver;
	
	public String excelName;
	
	@BeforeTest
	public void getExcelName() {
		excelName ="createLead";
	}
	@Parameters({"url"})
	
	@BeforeMethod
	public void BeforeMeth(String url) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
	}

}
