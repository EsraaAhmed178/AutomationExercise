package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Hooks {

    static WebDriver driver;
    @Before
    public void setUp(){
        driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
   /* @After
    public void tearDown(){
        driver.quit();
    }*/
}
