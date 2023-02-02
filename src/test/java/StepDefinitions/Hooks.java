package StepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    public static WebDriver driver;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/home/javier/Descargas/driver/chromedriver_linux64/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");
        options.addArguments("disable-notifications");
        options.addArguments("incognito");
        driver=new ChromeDriver(options);
        driver.get("https://www.avianca.com/co/es/");
    }
    @After
    public void finis(){driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
