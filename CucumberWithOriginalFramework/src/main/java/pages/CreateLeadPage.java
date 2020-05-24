package pages;

import cucumber.api.java.en.When;
import designimplementation.CucumberCreateLead;

public class CreateLeadPage extends CucumberCreateLead{

	@When("User1 enters companyname as TestLeaf")
	public CreateLeadPage enterCpnyname() {
		enterText(locateElement("id","createLeadForm_companyName"),"TestLeaf");
		return this;
	}

	@When("User1 enters Sangavi value in firstname field")
	public CreateLeadPage enterFirstName() {
		enterText(locateElement("id","createLeadForm_firstName"),"KK");
		return this;
	}
	
	@When("User1 enters (.*) value in lastname field")
	public CreateLeadPage enterLastName(String lname) {
		enterText(locateElement("id","createLeadForm_lastName"),lname);
		return this;
	}
	
	@When("User1 clicks on Submit button")
	public ViewPage clickCreateLeadSubmitButton() {
		clickElement(locateElement("classname","smallSubmit"));
		return new ViewPage();
	}

}
