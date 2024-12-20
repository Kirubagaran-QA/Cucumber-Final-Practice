package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        //(features = "src/test/resources/features/login.feature",
        //glue = {"stepdefinitions", "utils","pages"},
        (dryRun = true, features = "src/test/resources/features",
                glue = {"stepDefinitions","pages","utils"},
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        monochrome = true)

public class TestRunner
{
}
