package framework.pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import framework.base.api.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	
	public MyHomePage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public MyLeadPage clickMyLead() {
		driver.findElementByLinkText("Leads").click();
		return new MyLeadPage(driver);
	}

}
