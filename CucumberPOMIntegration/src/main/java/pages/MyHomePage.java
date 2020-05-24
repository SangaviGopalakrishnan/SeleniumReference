package pages;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.When;
import steps.ProjectSpecificMethods;


public class MyHomePage extends ProjectSpecificMethods {

	@When("User clicks on Leads button")
	public MyLeadPage clickMyLead() {
		driver.findElementByLinkText("Leads").click();
		return new MyLeadPage();
	}

}
