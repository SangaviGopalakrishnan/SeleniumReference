package framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import framework.base.api.ProjectSpecificMethods;

public class MyLeadPage extends ProjectSpecificMethods{
	
	public MyLeadPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.LINK_TEXT,using ="Create Lead")
	WebElement eleclickCreateLead;
	
	public CreateLeadPage clickCreateLead() {
		eleclickCreateLead.click();
		return new CreateLeadPage();
	}

}
