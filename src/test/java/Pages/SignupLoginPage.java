package Pages;

import Pages.RegisterPages.SingupPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignupLoginPage {
    WebDriver driver;
    WebDriverWait wait;
    SingupPage singupPage;

    By userNameSignUpBy= By.xpath("//input[@name='name']");
    By emialSignUpBy=By.xpath("//input[@data-qa='signup-email']");
    By signUpBtnBy=By.xpath("//form[@action='/signup']/button");
    By failedMessage= By.xpath("//p[text()='Email Address already exist!']");


    By emialLoginBy=By.xpath("//input[@data-qa='login-email']");
    By passwordLoginBy=By.xpath("//input[@data-qa='login-password']");
    By loginBtnBy=By.xpath("//button[@data-qa='login-button']");
    By failedLoginMessage= By.xpath("//p[text()='Your email or password is incorrect!']");

    public SignupLoginPage(WebDriver driver) {
        this.driver = driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void userEnterNameSingup(String userName){
        driver.findElement(userNameSignUpBy).sendKeys(userName);
    }

    public void userEnterEmialingup(String email){
        driver.findElement(emialSignUpBy).sendKeys(email);
    }

    public SingupPage goToSingupPage(){
        driver.findElement(signUpBtnBy).click();
        return new SingupPage(driver);
    }

    public void userEnterANewNameAndExistingEmailAddress(String newName, String exitEmail) {
        driver.findElement(userNameSignUpBy).sendKeys(newName);
        driver.findElement(emialSignUpBy).sendKeys(exitEmail);

    }

    public boolean userSeesErrorMessage() {

        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(failedMessage))).isDisplayed();
    }


    public void userEnterValidRegisteredEmail(String registerEmail) {
        driver.findElement(emialLoginBy).sendKeys(registerEmail);

    }
    public void userEnterValidPassword(String password) {
        driver.findElement(passwordLoginBy).sendKeys(password);

    }

    public LoginPage goTOLoginPage() {
        driver.findElement(loginBtnBy).click();
        return new LoginPage(driver);
    }



    public void userEnterInValidRegisteredEmailOrPassword(String email, String password) {
        driver.findElement(emialLoginBy).sendKeys(email);
        driver.findElement(passwordLoginBy).sendKeys(password);

    }


    public boolean yourEmailOrPasswordIsIncorrectMessage() {
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(failedLoginMessage))).isDisplayed();
    }










}
