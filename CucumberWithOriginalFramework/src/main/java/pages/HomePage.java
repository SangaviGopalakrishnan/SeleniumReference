package pages;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.When;
import designimplementation.CucumberCreateLead;


public class HomePage extends CucumberCreateLead {

	
	public LoginPage clickLogout() {
		clickElement(locateElement("classname","decorativeSubmit"));
		return new LoginPage();
	}
	
	@When("User1 clicks on crmsfa link")
	public MyHomePage clickCrmsfa() {
		clickElement(locateElement("linktext","CRM/SFA"));
		return new MyHomePage();
	}

}
