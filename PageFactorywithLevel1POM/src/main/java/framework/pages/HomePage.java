package framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import framework.base.api.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.CLASS_NAME,using ="decorativeSubmit")
	WebElement eleclickLogout;
	
	@FindBy(how = How.LINK_TEXT,using ="CRM/SFA")
	WebElement eleclickCrmsfa;
	
	public LoginPage clickLogout() {
		eleclickLogout.click();
		return new LoginPage();
	}
	
	public MyHomePage clickCrmsfa() {
		eleclickCrmsfa.click();
		return new MyHomePage();
	}

}
