package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features=".//features/customer.feature",
		glue="StepDefinitions",
		dryRun=false,
	monochrome=true,
	plugin= {"pretty","html:test-output1.html"}
		
		)
 //plugin= {"pretty","html:test-output.html"}
//plugin= {"pretty","json:test-output.json"}
public class Runner_Class {

}
