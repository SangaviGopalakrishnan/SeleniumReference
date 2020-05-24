package framework.pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import framework.base.api.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public LoginPage enterUsername(String uname) {
		driver.findElementById(prop.getProperty("LoginPage.username.id")).sendKeys(uname);
		return this;
	}

	public LoginPage enterPassword(String pwd) {
		driver.findElementById(prop.getProperty("LoginPage.password.id")).sendKeys(pwd);
		return this;
	}
	
	public HomePage clickLogin() {
		driver.findElementByClassName(prop.getProperty("LoginPage.decorativeSubmit.className")).click();
		return new HomePage(driver);
	}
}
