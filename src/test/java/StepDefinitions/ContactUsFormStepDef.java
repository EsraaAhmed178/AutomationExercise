package StepDefinitions;

import Pages.ContactUsFormPages.ContactUsFormPage;
import Pages.ContactUsFormPages.SubmittedSuccessfullyPage;
import Hooks.Hooks;
import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ContactUsFormStepDef {
    HomePage homePage = new HomePage(Hooks.driver);
    ContactUsFormPage contactUsFormPage;
    SubmittedSuccessfullyPage submittedSuccessfullyPage;


    @When("user click on Contact Us")
    public void clickOnContactUs(){
        contactUsFormPage=homePage.goToContactUsFormPage();


    }

    @Then("user enter name,email, subject and message")
    public void userEnterNameEmailSubjectAndMessage() {
        contactUsFormPage.userEnterAllData("vvv","e@gmail.com","ss","mm");




    }

    @And("click on Submit button")
    public void clickOnSubmitButton() {
        contactUsFormPage.clickOnSubmitButton();

    }

    @And("accept alert")
    public void acceptAlert() {
        submittedSuccessfullyPage=contactUsFormPage.acceptAlert();


    }

    @Then("user sees Success message")
    public void userSeesSuccessMessage() {
        Assert.assertTrue(submittedSuccessfullyPage.userSeesSuccessMessage());


    }

    @Then("submit does not occur")
    public void submitDoesNotOccur() {
        Assert.assertTrue(contactUsFormPage.getCurrentUrl());
    }

    @And("cancel alert")
    public void cancelAlert() {
        contactUsFormPage.cancelAlert();
        Assert.assertTrue(contactUsFormPage.getCurrentUrl());

    }


}
