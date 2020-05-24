package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import designimplementation.CucumberCreateLead;

public class CreateHooks  extends CucumberCreateLead{

	@Before
	public void beforeMeth() {
		launchBrowser("chrome","http://leaftaps.com/opentaps/control/main");
	}
	
	@After
	public void afterMeth() {
		closeBrowser();
	}
}
