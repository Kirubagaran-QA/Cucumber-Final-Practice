package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
    private WebDriver driver;

    //Add Elements
    @FindBy(css ="div#nav-tools a:nth-child(2)")
    public WebElement loginLink;
    @FindBy(id = "nav-logo-sprites")
    private WebElement mainLogo;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public WebElement logoDisplayed()
    {
        return mainLogo;
    }

}
