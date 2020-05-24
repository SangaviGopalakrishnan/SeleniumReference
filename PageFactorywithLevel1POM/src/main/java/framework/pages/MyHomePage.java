package framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import framework.base.api.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	
	public MyHomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.LINK_TEXT,using ="Leads")
	WebElement eleclickMyLead;
	
	public MyLeadPage clickMyLead() {
		eleclickMyLead.click();
		return new MyLeadPage();
	}

}
