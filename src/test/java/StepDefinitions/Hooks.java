package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class Hooks {

    static WebDriver driver;
    static WebDriverWait wait;
    static Actions action;
    static Alert alert;
    static JavascriptExecutor js ;
    @Before
    public void setUp(){
        driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        action=new Actions(driver);
        js= (JavascriptExecutor) driver;



    }
   /* @After
    public void tearDown(){
        driver.quit();
    }*/
}
