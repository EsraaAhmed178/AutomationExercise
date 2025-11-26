package Pages.ProductPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlaceOrderPage {
    WebDriver driver;
    OrderConfirmedPage orderConfirmedPage;

    By nameOfCardBy=By.xpath("//input[@data-qa='name-on-card']");
    By namberOfCardBy=By.xpath("//input[@data-qa='card-number']");
    By cvcBy=By.xpath("//input[@data-qa='cvc']");
    By expritionMonthOfCardBy=By.xpath("//input[@data-qa='expiry-month']");
    By expritionYearOfCardBy=By.xpath("//input[@data-qa='expiry-year']");
    By payButtonBy=By.xpath("//button[@data-qa='pay-button']");

    public PlaceOrderPage(WebDriver driver) {
        this.driver = driver;
    }
    public void userEnterPaymentDetails() {
        driver.findElement(nameOfCardBy).sendKeys("asd");
        driver.findElement(namberOfCardBy).sendKeys("124");
        driver.findElement(cvcBy).sendKeys("445");
        driver.findElement(expritionMonthOfCardBy).sendKeys("03");
        driver.findElement(expritionYearOfCardBy).sendKeys("2020");

    }

    public OrderConfirmedPage userClickOnPayButton() {
        driver.findElement(payButtonBy).click();
        return new OrderConfirmedPage(driver);
    }

    public void userEnterInvalidPaymentDetails() {

        driver.findElement(nameOfCardBy).sendKeys("");
        driver.findElement(namberOfCardBy).sendKeys("");
        driver.findElement(cvcBy).sendKeys("");
        driver.findElement(expritionMonthOfCardBy).sendKeys("");
        driver.findElement(expritionYearOfCardBy).sendKeys("");

    }
}
