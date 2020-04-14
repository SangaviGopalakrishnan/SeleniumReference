package week6day1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import week5common.CommonFile;
import week5day2parameter.CommonFileParameter;

public class DynamicParameter extends DynamicCommonFileParameter{

	@BeforeTest
	public void setExcelFileName() {
		excelName = "testcase1";
	}
	@Test (dataProvider="getData")
	public void CreateLeadTest (String cname,String fname,String lname){		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
		driver.findElementByName("submitButton").click();
	}
}






