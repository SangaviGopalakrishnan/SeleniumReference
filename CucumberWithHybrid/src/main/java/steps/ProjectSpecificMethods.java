package steps;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import designimplementation.CucumberCreateLead;
import utils.ReadFromExcel;

public class ProjectSpecificMethods  extends CucumberCreateLead{
	
	public String excelName;
	

	@BeforeMethod
	public void beforeMeth() {
		launchBrowser("chrome","http://leaftaps.com/opentaps/control/main");
	}
	
	@AfterMethod
	public void afterMeth() {
		closeBrowser();
	}
	
	@DataProvider
	public String[][] getData() throws IOException {
		ReadFromExcel readexcel = new ReadFromExcel();
		return readexcel.getDataFromExcel(excelName);
		
	}
}
