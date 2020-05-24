package framework.pages;

import framework.base.api.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{
	
	
	
	public CreateLeadPage enterCpnyname(String cpnyname) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cpnyname);
		return this;
	}

	public CreateLeadPage enterFirstName(String fname) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
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
