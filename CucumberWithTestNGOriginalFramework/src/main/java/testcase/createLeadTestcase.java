package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import steps.ProjectSpecificMethods;

public class createLeadTestcase extends ProjectSpecificMethods {
	
	@BeforeTest
	public void getExcelName() {
		excelName = "TC001_CreateLead";
	}
	
	@Test(dataProvider="getData")
	public void executeCreateLead(String uname,String pwd,String lname) throws Exception{
		new LoginPage()
		.enterUsername(uname)
		.enterPassword(pwd)
		.clickLogin()
		.clickCrmsfa()
		.clickMyLead()
		.clickCreateLead()
		.enterCpnyname()
		.enterFirstName()
		.enterLastName(lname)
		.clickCreateLeadSubmitButton()
		.FNameCheck();
	}

}
