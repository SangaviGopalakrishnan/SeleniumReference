package pages;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.When;
import steps.ProjectSpecificMethods;

public class MyLeadPage extends ProjectSpecificMethods{
	
	@When("User clicks on createLead button")
	public CreateLeadPage clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();
	}

}
