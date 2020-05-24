package framework.pages;

import framework.base.api.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	
	public LoginPage clickLogout() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new LoginPage();
	}
	
	public MyHomePage clickCrmsfa() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage();
	}

}
