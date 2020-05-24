package pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.When;

public class CreateLeadPage extends steps.ProjectSpecificMethods{

	@When("User enters companyname as TestLeaf")
	public CreateLeadPage enterCpnyname() {
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		return this;
	}

	@When("User enters Sangavi value in firstname field")
	public CreateLeadPage enterFirstName() {
		driver.findElementById("createLeadForm_firstName").sendKeys("Sangavi");
		return this;
	}
	
	@When("User enters (.*) value in lastname field")
	public CreateLeadPage enterLastName(String lname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
		return this;
	}
	
	@When("User clicks on Submit button")
	public ViewPage clickCreateLeadSubmitButton() {
		driver.findElementByClassName("smallSubmit").click();
		return new ViewPage();
	}

}
