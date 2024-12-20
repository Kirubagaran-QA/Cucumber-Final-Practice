package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverManager
{
    public static WebDriver getDriver(String driver)
    {
        if (driver.equalsIgnoreCase("chrome"))
            return new ChromeDriver();
        else if (driver.equalsIgnoreCase("firefox"))
            return new FirefoxDriver();
        else if (driver.equalsIgnoreCase("safari"))
            return new SafariDriver();
        else
            throw new IllegalArgumentException("Invalid driver name. Please choose either Chrome, Firefox, or Safari.");
    }

}
