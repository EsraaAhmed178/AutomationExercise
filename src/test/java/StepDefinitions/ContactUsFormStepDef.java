package StepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ContactUsFormStepDef {

    By contactUsBtn=By.xpath("//a[@href='/contact_us']");
    By nameBy=By.xpath("//input[@data-qa='name']");
    By emailBy=By.xpath("//input[@data-qa='email']");
    By subjectBy=By.xpath("//input[@data-qa='subject']");
    By messageBy=By.id("message");
    By submitBtnBy=By.xpath("//input[@data-qa='submit-button']");
    By succesMessage=By.xpath("//div[text()='Success! Your details have been submitted successfully.']");



    @When("user click on Contact Us")
    public void clickOnContactUs(){
        Hooks.driver.findElement(contactUsBtn).click();

    }

    @Then("user enter name,email, subject and message")
    public void userEnterNameEmailSubjectAndMessage() {
        Hooks.driver.findElement(nameBy).sendKeys("esed");
        Hooks.driver.findElement(emailBy).sendKeys("eea@gmail.com");
        Hooks.driver.findElement(subjectBy).sendKeys("cdfvfv");
        Hooks.driver.findElement(messageBy).sendKeys("fvbddscs");



    }

    @And("click on Submit button")
    public void clickOnSubmitButton() {
        Hooks.driver.findElement(submitBtnBy).click();
    }

    @And("accept alert")
    public void acceptAlert() {
        Hooks.alert=Hooks.driver.switchTo().alert();
        Hooks.alert.accept();

    }

    @Then("user sees Success message")
    public void userSeesSuccessMessage() {
        Assert.assertTrue(Hooks.driver.findElement(succesMessage).isDisplayed());

    }

    @Then("submit does not occur")
    public void submitDoesNotOccur() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://automationexercise.com/contact_us");
    }

    @And("cancel alert")
    public void cancelAlert() {
        Hooks.alert=Hooks.driver.switchTo().alert();
        Hooks.alert.dismiss();
    }
}
