package pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.When;
import designimplementation.CucumberCreateLead;
import steps.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{

	public CreateLeadPage enterCpnyname() {
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		return this;
	}

	public CreateLeadPage enterFirstName() {
		driver.findElementById("createLeadForm_firstName").sendKeys("Sangavi");
		return this;
	}
	
	public CreateLeadPage enterLastName(String lname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
		return this;
	}
	
	public ViewPage clickCreateLeadSubmitButton() {
		driver.findElementByClassName("smallSubmit").click();
		return new ViewPage();
	}

}
