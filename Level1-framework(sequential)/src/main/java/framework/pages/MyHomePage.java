package framework.pages;

import framework.base.api.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	
	public MyLeadPage clickMyLead() {
		driver.findElementByLinkText("Leads").click();
		return new MyLeadPage();
	}

}
