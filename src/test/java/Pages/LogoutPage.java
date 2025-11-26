package Pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LogoutPage {
    WebDriver driver;
    By logoutBy=By.xpath("//a[@href='/logout']");

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }


    public boolean userRedirectToLoginSignupPage() {
        return driver.getCurrentUrl().equals("https://automationexercise.com/login");


    }
}
