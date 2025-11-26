package Pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestCasesPage {
    WebDriver driver;
    By testCasesHeader=By.xpath ( "//u[contains(text(),'Test Cases')]");

    public TestCasesPage(WebDriver driver) {
        this.driver = driver;
    }




    public boolean testCasesLoadSuccessfully() {
        driver.getCurrentUrl().equals("https://automationexercise.com/test_cases");
        return(driver.findElement(testCasesHeader).isDisplayed());

    }

}
