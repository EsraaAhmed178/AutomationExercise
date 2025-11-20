package StepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LoginStepDef {

    By emialLoginBy=By.xpath("//input[@data-qa='login-email']");
    By passwordLoginBy=By.xpath("//input[@data-qa='login-password']");
    By loginBtnBy=By.xpath("//button[@data-qa='login-button']");
    By acualLoginAsText=By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[10]/a");
    String expectedLoginAsText= "Logged in as ";
    By failedMessage= By.xpath("//p[text()='Your email or password is incorrect!']");

    @When("user enter valid registered email and password")
    public void userEnterValidRegisteredEmailAndPassword() {
        Hooks.driver.findElement(emialLoginBy).sendKeys("eeeaaaaaaa@gmail.com");
        Hooks.driver.findElement(passwordLoginBy).sendKeys("123");

    }

    @And("click on Login button")
    public void clickOnLoginButton() {

        Hooks.driver.findElement(loginBtnBy).click();


    }


    public String getText(){
        return Hooks.driver.findElement(acualLoginAsText).getText();
    }
    @Then("User sees “Logged in as <username>\"")
    public void userSeesLoggedInAsUsername() {
        Assert.assertTrue(getText().contains(expectedLoginAsText));
    }

    @When("user enter invalid registered {string} and {string}")
    public void userEnterValidRegisteredAnd(String email, String password) {
        Hooks.driver.findElement(emialLoginBy).sendKeys(email);
        Hooks.driver.findElement(passwordLoginBy).sendKeys(password);

    }

    @Then("User sees Your email or password is incorrect!")
    public void userSeesYourEmailOrPasswordIsIncorrect() {
        Hooks.wait.until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(failedMessage))).isDisplayed();
    }
}

