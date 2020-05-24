package pages;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.When;
import designimplementation.CucumberCreateLead;


public class MyHomePage extends CucumberCreateLead {

	@When("User1 clicks on Leads button")
	public MyLeadPage clickMyLead() {
		clickElement(locateElement("linktext","Leads"));
		return new MyLeadPage();
	}

}
