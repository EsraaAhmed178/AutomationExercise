package Pages.ProductPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddressDetailsPage {
    WebDriver driver;
    PlaceOrderPage placeOrderPage;

    By addressDetailsBy=By.xpath("//h2[text()='Address Details']");
    By placeOrderBy=By.xpath("//a[contains(text(),'Place Order')]");

    public AddressDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void userValidateAddress() {

        Assert.assertTrue(driver.findElement(addressDetailsBy).isDisplayed());


    }

    public PlaceOrderPage userClickOnPlaceOrder() {
        driver.findElement(placeOrderBy).click();
        return new PlaceOrderPage(driver);
    }


}
