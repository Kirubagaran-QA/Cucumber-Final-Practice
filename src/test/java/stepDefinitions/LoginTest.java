package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.LoginPage;
import utils.WebDriverManager;

import java.time.Duration;

public class LoginTest
{
    private static WebDriver driver;
    public LoginPage loginPage;
    Actions actions;
//    Given I am on the Browser
//    And I Navigate to the URL
//    And I click the login button
//    When I enter valid username "9360658995" and password "Kiruba@4545"
//    Then I should be logged in successfully
    //Then I quit the browser


    @Given("I am on the application Browser")
    public void onBrowser()
    {
        driver = WebDriverManager.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @And("I Navigate to the application URL")
    public void navigateUrl()
    {
        driver.get("https://www.amazon.in/");
    }

    @And("I click the login button")
    public void clickTheLoginButton()
    {
        loginPage = new LoginPage(driver);
        actions = new Actions(driver);
        WebElement mouseHover = driver.findElement(loginPage.getLoginHover());
        actions.moveToElement(mouseHover).perform();
        driver.findElement(loginPage.getLoginButton()).click();
    }

    @When("I enter valid username {string} and password {string}")
    public void enterValidCredentials(String username, String password)
    {
        driver.findElement(loginPage.getUserName()).sendKeys(username, Keys.ENTER);
        driver.findElement(loginPage.getPassword()).sendKeys(password,Keys.ENTER);
    }

    @Then("I should be logged in successfully")
    public void loggedInSuccessfully()
    {
        String result = driver.getTitle();
        System.out.println("Page title is: " + result);
    }

    @Then("I quit the login browser")
    public void quitBrowser()
    {
        driver.quit();
    }

}
