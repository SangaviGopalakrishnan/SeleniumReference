package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import designimplementation.CucumberCreateLead;
import steps.ProjectSpecificMethods;
public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage enterUsername(String uname) {
		WebElement ele = locateElement("id","username");	
		enterText(ele, uname);
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
