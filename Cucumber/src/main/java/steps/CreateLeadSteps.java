package steps;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadSteps extends CommonClass{
	
	@Given("User enters (.*) in username field")
	public void enterUsername(String uname) {
		driver.findElementById("username").sendKeys(uname);
	}

	@Given("User enters (.*) in password field")
	public void enterPassword(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
	}
	
	@When("User clicks on decorativesubmit button")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@When("User clicks on crmsfa link")
	public void clickCrmsfa() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@When("User clicks on Leads button")
	public void clickMyLead() {
		driver.findElementByLinkText("Leads").click();
	}
	
	@When("User clicks on createLead button")
	public void clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@When("User enters companyname as TestLeaf")
	public void enterCpnyname() {
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
	}

	@When("User enters Sangavi value in firstname field")
	public void enterFirstName() {
		driver.findElementById("createLeadForm_firstName").sendKeys("Sangavi");
	}
	
	@When("User enters (.*) value in lastname field")
	public void enterLastName(String lname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
	}
	
	@When("User clicks on Submit button")
	public void clickCreateLeadSubmitButton() {
		driver.findElementByClassName("smallSubmit").click();
	}
	
	@Then("User should able to see View Lead page")
	public void Created() {
			System.out.println("Created Lead");
	} 
	
	@But("User should be in CreateLead page")
	public void NotCreated() {
			System.out.println(" Lead not created");
		
	}
	@But("User should be in Login page since login failed")
	public void LoginFailed() {
			System.out.println("Login Failed");
		
	} 
}
