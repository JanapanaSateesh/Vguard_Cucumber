package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resource/Features/SalesforceLogin.feature",
		monochrome = true,
		glue= {"Steps"},
		plugin= {"html:target/cucumber-report.html", "json:target/cucumber.json"}
)
public class TestRunner {

}
