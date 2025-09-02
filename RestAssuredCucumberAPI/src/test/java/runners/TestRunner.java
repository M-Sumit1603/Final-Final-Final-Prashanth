package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDefinitions",

        plugin = {"html:target/cucumber-html-reports",
                "pretty", "json:target/cucumber.json"}, // <-- generate JSON report here
        monochrome = true
)
public class TestRunner {
}
