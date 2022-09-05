package testRunner;
//This is my test runner class

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features=".//Features/Login1.feature", //specific feature file executed
	//	features={".//Features/Login1.feature",".//Features/Customers1.feature"},//if want to few no. of feature file
		features=".//Features/", //All feature file executed
		glue="stepDefinitions",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:test-output"},
		//tags= {"@sanity"}
		//tags= {"@sanity","@regression"} //OR
		tags= {"@sanity,@regression"} //And
		)
public class TestRunner {

}
