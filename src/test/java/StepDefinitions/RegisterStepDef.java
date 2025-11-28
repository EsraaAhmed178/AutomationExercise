package StepDefinitions;

import Hooks.Hooks;
import Pages.RegisterPages.AccountCreatedPage;
import Pages.HomePage;
import Pages.SignupLoginPage;
import Pages.RegisterPages.SingupPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class RegisterStepDef {
    HomePage homePage = new HomePage(Hooks.driver);
    SignupLoginPage signupLoginPage;
    SingupPage singupPage;
    AccountCreatedPage accountCreatedPage;

    @Given ("user in home page")
    public void userInHomePage(){
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://automationexercise.com/");
    }

    @When("user click on signup login")
    public void userClickOnSignupLogin() {
        signupLoginPage=homePage.goToSignupLoginPage();
    }

    @Then("user navigate to Signup Login page")
    public void userNavigateToSignupLoginPage() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://automationexercise.com/login");

    }

    @When("user enter a new name and email address")
    public void userEnterANewNameAndEmailAddress() {
        signupLoginPage.userEnterNameSingup("esraa");
        signupLoginPage.userEnterEmialingup("esraaaaaaaaaaaaaaaaaaaaaaaaa@gmail.com");

    }

    @And("click on Signup button")
    public void clickOnSignupButton() {
        singupPage=signupLoginPage.goToSingupPage();

    }

    @Then("user navigate to Signup page")
    public void userNavigateToSignupPage() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://automationexercise.com/signup");

    }

    @When("user enter a Password, First name, Last name, Address, State, City, Zipcode and Mobile Number")
    public void userEnterAPasswordFirstNameLastNameAddressStateCityZipcodeAndMobileNumber() {
        singupPage.userEnterAPasswordFirstNameLastNameAddressStateCityZipcodeAndMobileNumber(
                "123","esraa","El-Kattan", "aaa","aaa","aaa","123","011547845"
        );

    }

    @And("the user selects country {string}")
    public void theUserSelectsCountry(String country) {
        singupPage.theUserSelectsCountry(country);

    }

    @And("click on Create Account button")
    public void clickOnCreateAccountButton() {
        accountCreatedPage=singupPage.clickOnCreateAccountButton();

    }

    @Then("“ACCOUNT CREATED!” message appears")
    public void accountCREATEDMessageAppears() {
        Assert.assertTrue(accountCreatedPage.accountCREATEDMessageAppears());

    }

    @When("user enter a new name and existing email address")
    public void userEnterANewNameAndExistingEmailAddress() {
        signupLoginPage.userEnterANewNameAndExistingEmailAddress("Ahmed","esraaaaa@gmail.com");

    }

    @Then("user sees Email Address already exist!")
    public void userSeesEmailAddressAlreadyExist() {
        Assert.assertTrue(signupLoginPage.userSeesErrorMessage());

    }
}
