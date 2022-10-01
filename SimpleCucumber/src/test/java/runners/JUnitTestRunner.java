package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
//{"pretty","html:target/cucumber-reports.html"},
plugin = ("json:target/cucumber-reports/CucumberTestReport.json"),
				glue = "StepDefinitions", 
                features = "src/test/java/features", 
                dryRun = false, 
                monochrome = true, 
                tags ="@basic, @run")
public class JUnitTestRunner {

}