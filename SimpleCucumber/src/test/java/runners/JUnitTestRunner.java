package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {		"pretty","html:target/RunCuke/cucumber.html"},
				glue = "StepDefinitions", 
                features = "src/test/java/features", 
                dryRun = false, 
                monochrome = true, 
                tags ="@basic")
public class JUnitTestRunner {

}