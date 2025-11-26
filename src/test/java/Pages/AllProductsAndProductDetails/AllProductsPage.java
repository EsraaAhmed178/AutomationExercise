package Pages.AllProductsAndProductDetails;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class AllProductsPage {
    WebDriver driver;
    ProductDetailsPage productDetailsPage;

    By productsBy=By.xpath("//a[text()='View Product']");
    By inputSearchBy=By.xpath("//input[@id ='search_product']");
    By searchIconBy=By.xpath("//button[@id='submit_search']");

    public AllProductsPage(WebDriver driver) {
        this.driver = driver;
    }


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
