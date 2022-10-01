package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:cucumber-reports/cucumber-reports.html",
				"json:cucumber-reports/Cucumber.json",
				"junit:cucumber-reports/Cucumber.xml"},
		glue = "StepDefinitions", 
                features = "src/test/java/features", 
                dryRun = false, 
                monochrome = true, 
                tags = "@second or @basic")
public class JUnitTestRunner {

}