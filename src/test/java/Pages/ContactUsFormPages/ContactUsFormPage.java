package Pages.ContactUsFormPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsFormPage {
    WebDriver driver;
    Alert alert;
    SubmittedSuccessfullyPage submittedSuccessfullyPage;


    By nameBy=By.xpath("//input[@data-qa='name']");
    By emailBy=By.xpath("//input[@data-qa='email']");
    By subjectBy=By.xpath("//input[@data-qa='subject']");
    By messageBy=By.id("message");
    By submitBtnBy=By.xpath("//input[@data-qa='submit-button']");

    public ContactUsFormPage(WebDriver driver) {
        this.driver = driver;


    }


    public void userEnterAllData(String name,String email, String subject, String message) {
        driver.findElement(nameBy).sendKeys(name);
        driver.findElement(emailBy).sendKeys(email);
        driver.findElement(subjectBy).sendKeys(subject);
        driver.findElement(messageBy).sendKeys(message);



    }

    public void clickOnSubmitButton() {
        driver.findElement(submitBtnBy).click();
    }

    public SubmittedSuccessfullyPage acceptAlert() {
        alert=driver.switchTo().alert();
        alert.accept();
        return new SubmittedSuccessfullyPage(driver);

    }

    public void cancelAlert() {
        alert=driver.switchTo().alert();
        alert.dismiss();

    }

    public boolean getCurrentUrl(){
        return driver.getCurrentUrl().equals("https://automationexercise.com/contact_us");
    }




}
