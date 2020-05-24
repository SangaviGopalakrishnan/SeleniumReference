package pages;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import designimplementation.CucumberCreateLead;
public class LoginPage extends CucumberCreateLead{
	
	@Given("User1 enters (.*) in username field")
	public LoginPage enterUsername(String uname) {
		WebElement ele = locateElement("id","username");	
		enterText(ele, uname);
		return this;
	}

	@Given("User1 enters (.*) in password field")
	public LoginPage enterPassword(String pwd) {
		enterText(locateElement("id","password"), pwd);
		return this;
	}
	
	@When("User1 clicks on decorativesubmit button")
	public HomePage clickLogin() {
		clickElement(locateElement("classname","decorativeSubmit"));
		return new HomePage();
	}
}
