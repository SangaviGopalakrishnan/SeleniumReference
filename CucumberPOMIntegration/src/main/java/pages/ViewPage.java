package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.Then;
import steps.ProjectSpecificMethods;

public class ViewPage extends ProjectSpecificMethods{

	@Then("User should able to see View Lead page")
	public ViewPage FNameCheck() {
			System.out.println("Created Lead");
		return this;
	} 

}
