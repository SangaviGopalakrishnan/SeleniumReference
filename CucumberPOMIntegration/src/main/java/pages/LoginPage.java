package pages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import steps.ProjectSpecificMethods;
public class LoginPage extends ProjectSpecificMethods{
	
	@Given("User enters (.*) in username field")
	public LoginPage enterUsername(String uname) {
		driver.findElementById("username").sendKeys(uname);
		return this;
	}

	@Given("User enters (.*) in password field")
	public LoginPage enterPassword(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
		return this;
	}
	
	@When("User clicks on decorativesubmit button")
	public HomePage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage();
	}
}
