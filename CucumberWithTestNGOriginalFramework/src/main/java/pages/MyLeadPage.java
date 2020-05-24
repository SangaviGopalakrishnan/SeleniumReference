package pages;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.When;
import designimplementation.CucumberCreateLead;
import steps.ProjectSpecificMethods;

public class MyLeadPage extends ProjectSpecificMethods{
	
	public CreateLeadPage clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();
	}

}
