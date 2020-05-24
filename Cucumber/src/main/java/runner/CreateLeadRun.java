package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/main/java/feature/CreateLead.feature","src/main/java/feature/CreateLeadNeg.feature"},
                 glue= {"steps"},
                 monochrome=true)

public class CreateLeadRun extends AbstractTestNGCucumberTests{

}
