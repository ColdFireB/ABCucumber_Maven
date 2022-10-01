package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber-reports/cucumber-reports.html",
				"json:target/cucumber-reports/Cucumber.json",
				"junit:target/cucumber-reports/Cucumber.xml"},
		glue = "StepDefinitions", 
                features = "src/test/java/features", 
                dryRun = false, 
                monochrome = true, 
                tags ="@basic")
public class JUnitTestRunner {

}