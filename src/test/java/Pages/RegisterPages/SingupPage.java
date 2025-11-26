package Pages.RegisterPages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SingupPage {
    WebDriver driver;
    WebDriverWait wait;
    AccountCreatedPage accountCreatedPage;

    By passwordBy= By.xpath("//input [@type='password' and @id='password']");
    By firstNameBy =By.xpath("//input[@id='first_name' and @data-qa='first_name']");
    By lastNameBy =By.xpath("//input[@id='last_name' and @data-qa='last_name']");
    By addressBy =By.xpath("//input[@id='address1' and @data-qa='address']");
    By countryBy =By.xpath("//select[@id='country' and @data-qa='country']");
    By stateBy=By.xpath("//input[@id='state' and @data-qa='state']");
    By cityBy=By.xpath("//input[@id='city' and @data-qa='city']");
    By ZipcodeBy=By.xpath("//input[@id='zipcode' and @data-qa='zipcode']");
    By mobileNumberBy=By.xpath("//input[@id='mobile_number' and @data-qa='mobile_number']");
    By createAccountButtonBy =By.xpath("//button[@data-qa='create-account']");






    public SingupPage(WebDriver driver) {
        this.driver = driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public void userEnterAPasswordFirstNameLastNameAddressStateCityZipcodeAndMobileNumber(
            String pass,String FN ,String LN , String address, String city, String state, String zip, String mobNumber
    ) {
        driver.findElement(passwordBy).sendKeys(pass);
        driver.findElement(firstNameBy).sendKeys(FN);
        driver.findElement(lastNameBy).sendKeys(LN);
        driver.findElement(addressBy).sendKeys(address);
        driver.findElement(cityBy).sendKeys(city);
        driver.findElement(stateBy).sendKeys(state);
        driver.findElement(ZipcodeBy).sendKeys(zip);
        driver.findElement(mobileNumberBy).sendKeys(mobNumber);

    }


    public void theUserSelectsCountry(String countryName) {
        WebElement countryElement = driver.findElement(countryBy);
        Select select = new Select(countryElement);
        select.selectByVisibleText(countryName);
    }

    public AccountCreatedPage clickOnCreateAccountButton() {
        driver.findElement(createAccountButtonBy).click();
        return new AccountCreatedPage(driver);

    }








}
