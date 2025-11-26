package StepDefinitions;

import Hooks.Hooks;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SignupLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LoginStepDef {
    HomePage homePage = new HomePage(Hooks.driver);
    SignupLoginPage signupLoginPage;
    LoginPage loginPage;

    @When("user enter valid registered email and password")
    public void userEnterValidRegisteredEmailAndPassword() {
        signupLoginPage=homePage.goToSignupLoginPage();
        signupLoginPage.userEnterValidRegisteredEmail("esraa@gmail.com");
        signupLoginPage.userEnterValidPassword("123");

    }

    @And("click on Login button")
    public void clickOnLoginButton() {
        loginPage=signupLoginPage.goTOLoginPage();

    }

    @Then("User sees “Logged in as <username>\"")
    public void userSeesLoggedInAsUsername() {
        Assert.assertTrue(loginPage.userSeesLoggedInAsUsername());
    }

    @When("user enter invalid registered {string} and {string}")
    public void userEnterValidInRegisteredEmail(String email, String password) {
        signupLoginPage=homePage.goToSignupLoginPage();
        signupLoginPage.userEnterInValidRegisteredEmailOrPassword(email,password);


    }

    @Then("User sees Your email or password is incorrect!")
    public void userSeesYourEmailOrPasswordIsIncorrect() {
        Assert.assertTrue(signupLoginPage.yourEmailOrPasswordIsIncorrectMessage());

    }



}
