package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (dryRun = true, features = "src/test/resources/features",
                glue = {"stepDefinitions","pages","utils"},
        plugin = {"pretty", "html:target/cucumber-reports.html", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        monochrome = true)

public class TestRunner
{
}
