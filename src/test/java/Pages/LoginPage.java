package Pages;

import Pages.ProductPages.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    ProductPage productPage;

    By acualLoginAsText=By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[10]/a");
    String expectedLoginAsText= "Logged in as ";
    By productBy=By.xpath("//a[@href='/products']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getText(){
        return driver.findElement(acualLoginAsText).getText();
    }

    public boolean userSeesLoggedInAsUsername() {
         return getText().contains(expectedLoginAsText);
    }

    public ProductPage goToProductPage(){
        driver.findElement(productBy).click();
        return new ProductPage(driver);
    }
}
