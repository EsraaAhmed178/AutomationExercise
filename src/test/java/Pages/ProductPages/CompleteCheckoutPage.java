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




    By emptyCartText=By.xpath("//b[contains(text(),'Cart is empty!')]");



    By loginDiv=By.xpath("//div[@class='modal-content']");

    public CompleteCheckoutPage(WebDriver driver) {
        this.driver = driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public AddressDetailsPage userProceedToCheckout() {

        if (!driver.getCurrentUrl().contains("view_cart")) {
            driver.navigate().to("https://automationexercise.com/view_cart");
        }

        WebElement checkoutButton = wait.until(ExpectedConditions.elementToBeClickable(checkoutBy));
        checkoutButton.click();
        return new AddressDetailsPage(driver);

    }

    public boolean userSeesCartIsEmpty() {
        return driver.findElement(emptyCartText).isDisplayed();

    }

    public boolean userSeesLoginDiv() {
        return driver.findElement(loginDiv).isDisplayed();

    }



















}
