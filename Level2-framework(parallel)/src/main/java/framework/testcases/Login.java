package framework.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import framework.base.api.ProjectSpecificMethods;
import framework.pages.LoginPage;

public class Login extends ProjectSpecificMethods {
	
	@BeforeTest
	public void getExcelName() {
		excelName ="createLead1";
	}
	
	@Test(dataProvider="getData")
	public void executeCreateLead(String uname,String pwd,String cpnyname,String fname,String lname) {
		new LoginPage(driver)
		.enterUsername(uname)
		.enterPassword(pwd)
		.clickLogin()
		.clickCrmsfa()
		.clickMyLead()
		.clickCreateLead()
		.enterCpnyname(cpnyname)
		.enterFirstName(fname)
		.enterLastName(lname)
		.clickCreateLeadSubmitButton()
		.FNameCheck(fname);
	}

}
