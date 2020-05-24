package framework.base.api;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import framework.utils.ReadExcel;

public class ProjectSpecificMethods {
	public  RemoteWebDriver driver;
	public String excelName;
	public static Properties prop;
	
	@BeforeSuite
	public void createprop() throws FileNotFoundException, IOException {
		prop = new Properties();
		prop.load(new FileInputStream("./eng.properties"));
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
