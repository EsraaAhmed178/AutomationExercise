package StepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class CompleteCheckout {

    By viewCartBy= By.xpath("//a[@href='/view_cart']");
    By checkoutBy=By.xpath("//a[contains(text(),'Proceed To Checkout')]");
    By addressDetailsBy=By.xpath("//h2[text()='Address Details']");
    By placeOrderBy=By.xpath("//a[contains(text(),'Place Order')]");

    By nameOfCardBy=By.xpath("//input[@data-qa='name-on-card']");
    By namberOfCardBy=By.xpath("//input[@data-qa='card-number']");
    By cvcBy=By.xpath("//input[@data-qa='cvc']");
    By expritionMonthOfCardBy=By.xpath("//input[@data-qa='expiry-month']");
    By expritionYearOfCardBy=By.xpath("//input[@data-qa='expiry-year']");
    By payButtonBy=By.xpath("//button[@data-qa='pay-button']");

    By confirmedMassege=By.xpath("//p[@style='font-size: 20px; font-family: garamond;']");
    String expectedMassege="Congratulations! Your order has been confirmed!";



    @Given("user in product page")
    public void userInProductPage() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://automationexercise.com/products");
    }

    @When("user click on View Cart")
    public void userClickOnViewCart(){
        //Hooks.wait.until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(viewCartBy))).click();

        WebElement viewCardWebElemant=Hooks.driver.findElement(viewCartBy);

        ((JavascriptExecutor) Hooks.driver).executeScript("arguments[0].click();", viewCardWebElemant);
    }

    @Then("user Proceed to Checkout")
    public void userProceedToCheckout() {
        //Hooks.wait.until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(checkoutBy))).click();

        WebElement checkoutWebElemant=Hooks.wait.until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(checkoutBy)));

        ((JavascriptExecutor) Hooks.driver).executeScript("arguments[0].click();", checkoutWebElemant);
    }

    @And("user Validate address")
    public void userValidateAddress() {

        Assert.assertTrue(Hooks.driver.findElement(addressDetailsBy).isDisplayed());


    }

    @And("user click on Place Order")
    public void userClickOnPlaceOrder() {
        Hooks.driver.findElement(placeOrderBy).click();
    }

    @And("user Enter payment details")
    public void userEnterPaymentDetails() {
        Hooks.driver.findElement(nameOfCardBy).sendKeys("asd");
        Hooks.driver.findElement(namberOfCardBy).sendKeys("124");
        Hooks.driver.findElement(cvcBy).sendKeys("445");
        Hooks.driver.findElement(expritionMonthOfCardBy).sendKeys("03");
        Hooks.driver.findElement(expritionYearOfCardBy).sendKeys("2020");
        Hooks.driver.findElement(payButtonBy).click();
    }

    public String getAcualMasseg(){
        return Hooks.driver.findElement(confirmedMassege).getText();
    }

    @Then("user sees “Your order has been placed successfully!”")
    public void userSeesYourOrderHasBeenPlacedSuccessfully() {
        Assert.assertTrue(getAcualMasseg().contains(expectedMassege));
    }


}
