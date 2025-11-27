package StepDefinitions;

import Hooks.Hooks;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProductPages.*;
import Pages.SignupLoginPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AddProductStepDef {

    HomePage homePage = new HomePage(Hooks.driver);
    ProductPage productPage;
    CompleteCheckoutPage completeCheckoutPage;
    AddressDetailsPage addressDetailsPage;
    PlaceOrderPage placeOrderPage;
    OrderConfirmedPage orderConfirmedPage;

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

    @When("user click on View Cart")
    public void userClickOnViewCart(){
        completeCheckoutPage=productPage.goToViewCart();
    }

    @Then("user Proceed to Checkout")
    public void userProceedToCheckout() {

        addressDetailsPage=completeCheckoutPage.userProceedToCheckout();
    }

    @And("user Validate address")
    public void userValidateAddress() {

        addressDetailsPage.userValidateAddress();
    }

    @And("user click on Place Order")
    public void userClickOnPlaceOrder() {

        placeOrderPage=addressDetailsPage.userClickOnPlaceOrder();
    }

    @And("user Enter payment details")
    public void userEnterPaymentDetails() {
        placeOrderPage.userEnterPaymentDetails();

    }

    @And("user click on pay button")
    public void userClickOnPayButton() {
        orderConfirmedPage=placeOrderPage.userClickOnPayButton();

    }

    @Then("user sees “Your order has been placed successfully!”")
    public void userSeesYourOrderHasBeenPlacedSuccessfully() {
        Assert.assertTrue(orderConfirmedPage.userSeesYourOrderHasBeenPlacedSuccessfully());

    }

    @And("user sees Cart is empty!")
    public void userSeesCartIsEmpty() {
        productPage=homePage.goToProductsPage();
        completeCheckoutPage=productPage.goToViewCart();

        Assert.assertTrue(completeCheckoutPage.userSeesCartIsEmpty());

    }

    @And("user Enter invalid payment details")
    public void userEnterInvalidPaymentDetails() {
        placeOrderPage.userEnterInvalidPaymentDetails();
    }

    @Then("user still in payment page")
    public void userStillInPaymentPage() {
        placeOrderPage.userStillInPaymentPage();

    }

    @And("user sees login Div")
    public void userSeesLoginDiv() {
        Assert.assertTrue(completeCheckoutPage.userSeesLoginDiv());

    }
}
