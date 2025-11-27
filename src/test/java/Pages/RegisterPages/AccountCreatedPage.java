package Pages.RegisterPages;

import Hooks.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AccountCreatedPage {
    WebDriver driver;

    By accountCreatedMessage=By.xpath("//b[contains(text(),'Account Created!')]");

    public AccountCreatedPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean accountCREATEDMessageAppears() {
        return driver.findElement(accountCreatedMessage).isDisplayed();


    }


}
