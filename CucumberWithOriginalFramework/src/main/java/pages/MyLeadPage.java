package pages;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.When;
import designimplementation.CucumberCreateLead;

public class MyLeadPage extends CucumberCreateLead{
	
	@When("User1 clicks on createLead button")
	public CreateLeadPage clickCreateLead() {
		clickElement(locateElement("linktext","Create Lead"));
		return new CreateLeadPage();
	}

}
