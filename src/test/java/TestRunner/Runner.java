package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions (
        features = "src/main/resources/Features",  // Path to your feature files
        glue = {"StepDefinitions", "Hooks"},  // Path to step definition classes
        plugin = {
                "pretty",  // Pretty console output
                "html:target/Reports/cucumber-testng-report.html",  // HTML report
                "json:target/cucumber-testng.json"  // JSON report

        },
        monochrome = true  // Makes the console output easier to read
)
public class Runner extends AbstractTestNGCucumberTests {


}
