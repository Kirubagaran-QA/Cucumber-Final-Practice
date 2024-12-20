package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
    // Add Page Elements
    private WebDriver driver;
    private By loginHover = By.cssSelector("div#nav-tools a:nth-child(2)");
    private By loginButton = By.cssSelector("div#nav-flyout-ya-signin>a>span");
    private By userName = By.cssSelector("input[autocomplete='username']");
    private By password = By.cssSelector("input[autocomplete='current-password']");

    //Constructor
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //Methods
    public By getLoginHover()
    {
        return loginHover;
    }

    public By getLoginButton()
    {
        return loginButton;
    }

    public By getUserName()
    {
        return userName;
    }

    public By getPassword()
    {
        return password;
    }
}
