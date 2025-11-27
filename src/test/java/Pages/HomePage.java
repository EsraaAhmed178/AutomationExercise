package Pages;

import Pages.ContactUsFormPages.ContactUsFormPage;
import Pages.ProductPages.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    SignupLoginPage signupLoginPage;
    ProductPage productPage;
    ContactUsFormPage contactUsFormPage;
    TestCasesPage testCasesPage;
    LogoutPage logoutPage;


    By signupLoginBy = By.xpath("//a[@href='/login']");
    By productBy=By.xpath("//a[@href='/products']");
    By contactUsBtn=By.xpath("//a[@href='/contact_us']");
    By testCaseBtn=By.xpath("//a[@href='/test_cases']");
    By logoutBy=By.xpath("//a[@href='/logout']");
    By cartBy=By.xpath("//a[@href='/view_cart']");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public SignupLoginPage goToSignupLoginPage(){
        driver.findElement(signupLoginBy).click();
        return new SignupLoginPage(driver);
    }

    public ProductPage goToProductsPage(){
        driver.findElement(productBy).click();
        return new ProductPage(driver);
    }


    public ContactUsFormPage goToContactUsFormPage(){
        driver.findElement(contactUsBtn).click();
        return new ContactUsFormPage(driver);
    }


    public TestCasesPage goToTestCasesPage(){
        driver.findElement(testCaseBtn).click();
        return new TestCasesPage(driver);
    }

    public LogoutPage goToLogoutPage(){
        driver.findElement(logoutBy).click();
        return new LogoutPage(driver);
    }








}
