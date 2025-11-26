package StepDefinitions;

import Hooks.Hooks;
import Pages.HomePage;
import Pages.LogoutPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LogOutStepDef {

    HomePage homePage=new HomePage(Hooks.driver);
    LogoutPage logoutPage;



    @When("user click on logout")
    public void clickOnLogout(){
        logoutPage=homePage.goToLogoutPage();


    }

    @Then("user Redirect to Login Signup page")
    public void userRedirectToLoginSignupPage() {
        Assert.assertTrue(logoutPage.userRedirectToLoginSignupPage());


    }
}
