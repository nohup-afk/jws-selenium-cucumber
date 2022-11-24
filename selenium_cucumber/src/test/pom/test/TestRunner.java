package test.pom.test;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/pom/feature",
		plugin = {
				"pretty",
				"html:target/cucumber", 
				"json:target/cucumber.json", 
				},
		monochrome = true
		)
 
public class TestRunner {
	
}
