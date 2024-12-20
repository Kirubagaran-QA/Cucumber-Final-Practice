package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.ReportGeneration;
import pages.HomePage;
import utils.WebDriverManager;

import java.time.Duration;

public class HomeTest extends ReportGeneration {
    private static WebDriver driver;
    private static HomePage homePage;

    @Given("I add the ExtentReport")
    public void addTheExtentReport() {


        setUpExtentReport(); // Implement your report setup here
    }

    @And("I launch the Browser for HomePage Test")
    public void onTheBrowser() {
        test = extent.createTest("Launch the Browser");
        test.info("Setting up the browser");
        driver = WebDriverManager.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        test.pass("Browser launched successfully.");

    }

    @When("I Navigate to the homepage URL")
    public void navigateToUrl() {
        test = extent.createTest("Navigate to Amazon Homepage");
        test.info("Navigating to the URL");
        driver.get("https://www.amazon.in/");
        test.pass("Navigated to Amazon homepage successfully.");
    }

    @Then("I should see the Homepage Of Application")
    public void seeTheHomePage() {
        test = extent.createTest("Verify Homepage Displayed");
        homePage = new HomePage(driver);
        Assert.assertTrue(homePage.logoDisplayed().isDisplayed(), "Home Page logo is not displayed.");
        test.pass("Home Page displayed successfully.");
    }

    @Then("I flush the report")
    public void flushReport()
    {
        tearDownExtentReport();
    }

    @Then("I quit the browser")
    public void closeBrowser()
    {
        test = extent.createTest("Close the Browser");
        driver.quit();
        test.pass("Browser closed successfully.");
    }
}
