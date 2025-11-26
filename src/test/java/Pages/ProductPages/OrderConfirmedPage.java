package Pages.ProductPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class OrderConfirmedPage {
    WebDriver driver;

    By confirmedMassege=By.xpath("//p[@style='font-size: 20px; font-family: garamond;']");
    String expectedMassege="Congratulations! Your order has been confirmed!";

    public OrderConfirmedPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getAcualMasseg(){
        return driver.findElement(confirmedMassege).getText();
    }

    public boolean userSeesYourOrderHasBeenPlacedSuccessfully() {
        return getAcualMasseg().contains(expectedMassege);
    }
}
