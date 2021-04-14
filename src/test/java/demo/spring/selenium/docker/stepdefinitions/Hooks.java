package demo.spring.selenium.docker.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void openBrowser() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://soraia.herokuapp.com");
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
