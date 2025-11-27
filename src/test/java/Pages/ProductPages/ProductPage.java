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
    ProductDetailsPage productDetailsPage;

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












    By productsBy=By.xpath("//a[text()='View Product']");
    By inputSearchBy=By.xpath("//input[@id ='search_product']");
    By searchIconBy=By.xpath("//button[@id='submit_search']");


    public boolean visibilityOfProductsList(){
        List<WebElement> products = driver.findElements(productsBy);
        return products.size()>0;
    }


    public ProductDetailsPage theUserOpensAnyProductFromTheList(int poductNumber) {
        driver.findElements(productsBy).get(poductNumber).click();
        return new ProductDetailsPage(driver);

    }


    public void userEnterInvalidSearchTextData() {
        driver.findElement(inputSearchBy).sendKeys("nnn");

    }


    public void clickOnSearchIcon() {
        driver.findElement(searchIconBy).click();
    }


    public boolean theProductsPageDisplayedEmpty() {
        return driver.getCurrentUrl().contains("https://automationexercise.com/products?search=");
    }


}
