package StepDefinitions;

import Hooks.Hooks;
import Pages.HomePage;
import Pages.ProductPages.*;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CompleteCheckoutStepDef {

    HomePage homePage = new HomePage(Hooks.driver);
    ProductPage productPage;
    CompleteCheckoutPage completeCheckoutPage;
    AddressDetailsPage addressDetailsPage;
    OrderConfirmedPage orderConfirmedPage;
    PlaceOrderPage placeOrderPage;



    @When("user click on View Cart")
    public void userClickOnViewCart() {
        productPage=homePage.goToProductsPage();
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

        orderConfirmedPage=placeOrderPage.userClickOnPayButton();
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
}
