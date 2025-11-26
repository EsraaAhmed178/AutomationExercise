package StepDefinitions;

import Hooks.Hooks;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProductPages.ProductPage;
import Pages.SignupLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddProductStepDef {

    HomePage homePage = new HomePage(Hooks.driver);
    SignupLoginPage signupLoginPage;
    LoginPage loginPage;
    ProductPage productPage;

    @When("user click on Products")
    public void clickOnProducts(){
        productPage = homePage.goToProductsPage();


    }

    @Then("user Hover over any product")
    public void userHoverOverAnyProduct() {
        productPage.userHoverOverAnyProduct();
    }

    @And("Click Add to Cart")
    public void clickAddToCart() {
        productPage.clickAddToCart();
    }


    @Then("Product added message displayed")
    public void productAddedMessageDisplayed() {
        Assert.assertTrue(productPage.productAddedMessageDisplayed());
    }

}
