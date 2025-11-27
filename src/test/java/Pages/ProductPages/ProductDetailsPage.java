package Pages.ProductPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage {
    WebDriver driver;

    By productNameBy =By.xpath("//h2[contains(text(),'Sleeveless Dress')]");
    By  categoryBy =By.xpath("//p[contains(text(),'Category')]");
    By  priceBy =By.xpath("//span[contains(text(),'Rs.')]");
    By  availabilityBy =By.xpath("//b[contains(text(),'Availability:')]");
    By  conditionBy =By.xpath("//b[contains(text(),'Condition:')]");
    By  brandBy =By.xpath("//b[contains(text(),'Brand:')]");

    public ProductDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean theCorrectProductDetailsShouldBeDisplayed() {
        return (driver.findElement(productNameBy).isDisplayed()&&
        driver.findElement(categoryBy).isDisplayed()&&
        driver.findElement(priceBy).isDisplayed()&&
        driver.findElement(availabilityBy).isDisplayed()&&
        driver.findElement(conditionBy).isDisplayed()&&
        driver.findElement(brandBy).isDisplayed());

    }
}
