package pages;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.When;
import designimplementation.CucumberCreateLead;
import steps.ProjectSpecificMethods;


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
