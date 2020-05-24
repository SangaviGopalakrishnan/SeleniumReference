package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class CreateHooks extends CommonClass{
	
	@Before
	public void beforeScenario(Scenario obj) {
		loginApp();
		System.out.println("TC name is "+obj.getName());
		System.out.println("TC id is "+obj.getId());
		System.out.println("TC status is "+obj.getStatus());		
	}
	
	@After
	public void AfterScenario(Scenario obj) {
		System.out.println("TC status is "+obj.getStatus());
	}
}
