package framework.pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import framework.base.api.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	
	public HomePage(RemoteWebDriver driver) {
		this.driver = driver;
	}


	public LoginPage clickLogout() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new LoginPage(driver);
	}
	
	public MyHomePage clickCrmsfa() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage(driver);
	}

}
