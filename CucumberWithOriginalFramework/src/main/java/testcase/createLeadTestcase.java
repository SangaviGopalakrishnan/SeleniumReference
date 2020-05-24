package testcase;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/main/java/feature/CucumberCreateLeads.feature"},glue={"pages","steps"},monochrome=true)
public class createLeadTestcase extends AbstractTestNGCucumberTests{

}
