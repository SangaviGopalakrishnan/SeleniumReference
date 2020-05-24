package framework.pages;

import framework.base.api.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage enterUsername(String uname) {
		driver.findElementById("username").sendKeys(uname);
		return this;
	}

	public LoginPage enterPassword(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
		return this;
	}
	
	public HomePage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage();
	}
}
