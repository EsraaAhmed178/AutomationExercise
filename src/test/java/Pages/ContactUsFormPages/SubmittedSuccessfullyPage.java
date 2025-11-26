package Pages.ContactUsFormPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SubmittedSuccessfullyPage {
    WebDriver driver;
    By succesMessage=By.xpath("//div[text()='Success! Your details have been submitted successfully.']");

    public SubmittedSuccessfullyPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean userSeesSuccessMessage() {
         return driver.findElement(succesMessage).isDisplayed();

    }
}
