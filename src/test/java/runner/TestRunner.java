package runner;

// Test Runner Not Worker
// Will Follow up with Sajjad Bhai


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@smoke",
		features = "src/test/java/feature",
		glue = {"stepDefinition", "baseUtil"},
		monochrome =false,
		dryRun = false,
		plugin = {"pretty", "html:target/report.html", "json:target/report.json", "junit:target/report.xml"}
		)

public class TestRunner {  
	

}
