package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.Then;
import designimplementation.CucumberCreateLead;
import steps.ProjectSpecificMethods;

public class ViewPage extends ProjectSpecificMethods{

	public ViewPage FNameCheck() {
			System.out.println("Created Lead");
		return this;
	} 

}
