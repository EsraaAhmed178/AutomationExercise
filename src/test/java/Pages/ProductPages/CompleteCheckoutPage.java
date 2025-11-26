package Pages.ProductPages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CompleteCheckoutPage {
    WebDriver driver;
    WebDriverWait wait;

    AddressDetailsPage addressDetailsPage;

    By checkoutBy=By.xpath("//a[contains(text(),'Proceed To Checkout')]");







    By loginDiv=By.xpath("//div[@class='modal-content']");

    public CompleteCheckoutPage(WebDriver driver) {
        this.driver = driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public AddressDetailsPage userProceedToCheckout() {
        //Hooks.wait.until(ExpectedConditions.visibilityOf(Hooks.driver.findElement(checkoutBy))).click();

        WebElement checkoutWebElemant=wait.until(ExpectedConditions.visibilityOf(driver.findElement(checkoutBy)));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkoutWebElemant);
        return new AddressDetailsPage(driver);
    }









    public void userSeesCartIsEmpty() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");

    }



    public void userStillInPaymentPage() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/payment");

    }


    public void userSeesLoginDiv() {
        Assert.assertTrue(driver.findElement(loginDiv).isDisplayed());

    }








}
