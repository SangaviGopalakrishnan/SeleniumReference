package framework.pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import framework.base.api.ProjectSpecificMethods;

public class MyLeadPage extends ProjectSpecificMethods{
	
	public MyLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
		}

	public CreateLeadPage clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage(driver);
	}

}
