package StepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class AddProductToCart {

    By productBy=By.xpath("//a[@href='/products']");
    By targetProduct=By.xpath("//img[@alt='ecommerce website products']");
    By addButton =By.xpath("(//a[@class='btn btn-default add-to-cart'])[1]");
    By acualMassege=By.xpath("//p[@class='text-center' and text()='Your product has been added to cart.']");
    String expectedMassege ="Your product has been added to cart.";





    @When("user click on Products")
    public void clickOnProducts(){
        Hooks.driver.findElement(productBy).click();

    }

    @Then("user Hover over any product")
    public void userHoverOverAnyProduct() {
        Hooks.action.moveToElement(Hooks.driver.findElement(targetProduct)).perform();




    }

    @And("Click Add to Cart")
    public void clickAddToCart() {
       // Hooks.wait.until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(addButton))).click();
        WebElement addWebElemant=Hooks.driver.findElement(addButton);

        ((JavascriptExecutor) Hooks.driver).executeScript("arguments[0].click();", addWebElemant);


    }

    public String getAcualMassege(){
        return Hooks.wait.until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(acualMassege))).getText();
    }

    @Then("Product added message displayed")
    public void productAddedMessageDisplayed() {

        Assert.assertTrue(getAcualMassege().contains(expectedMassege));
    }
}
