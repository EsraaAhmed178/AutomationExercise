package Pages.ProductPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProductPage {
    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    CompleteCheckoutPage completeCheckoutPage;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        action=new Actions(driver);
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By targetProduct=By.xpath("//img[@alt='ecommerce website products']");
    By addButton =By.xpath("(//a[@class='btn btn-default add-to-cart'])[1]");
    By acualMassege=By.xpath("//p[@class='text-center' and text()='Your product has been added to cart.']");
    String expectedMassege ="Your product has been added to cart.";

    By viewCartBy= By.xpath("//a[@href='/view_cart']");




    public void userHoverOverAnyProduct() {
        action.moveToElement(driver.findElement(targetProduct)).perform();
    }

    public void clickAddToCart() {
        WebElement addWebElemant=driver.findElement(addButton);

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addWebElemant);
    }

    public String getAcualMassege(){
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(acualMassege))).getText();
    }

    public boolean productAddedMessageDisplayed() {

        return getAcualMassege().contains(expectedMassege);
    }

    public CompleteCheckoutPage goToViewCart(){
        WebElement viewCardWebElemant=driver.findElement(viewCartBy);

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", viewCardWebElemant);
        return new CompleteCheckoutPage(driver);
    }


}
