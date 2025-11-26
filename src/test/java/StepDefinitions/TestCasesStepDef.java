package StepDefinitions;

import Hooks.Hooks;
import Pages.HomePage;
import Pages.TestCasesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TestCasesStepDef {
    HomePage homePage=new HomePage(Hooks.driver);
    TestCasesPage testCasesPage;

    @When("user click on Click Test Cases")
    public void clickOcTestCases(){
        testCasesPage=homePage.goToTestCasesPage();

    }

    @Then("Test cases load successfully")
    public void testCasesLoadSuccessfully() {

        Assert.assertTrue(testCasesPage.testCasesLoadSuccessfully());

    }
}
