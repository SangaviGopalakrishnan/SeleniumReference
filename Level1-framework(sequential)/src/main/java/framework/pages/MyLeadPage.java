package framework.pages;

import framework.base.api.ProjectSpecificMethods;

public class MyLeadPage extends ProjectSpecificMethods{
	
	public CreateLeadPage clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();
	}

}
