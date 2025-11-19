package StepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegisterStepDef {

    By signupLoginBy = By.xpath("//a[@href='/login']");
    By userNameSignUpBy= By.xpath("//input[@name='name']");
    By emialSignUpBy=By.xpath("//input[@data-qa='signup-email']");
    By signUpBtnBy=By.xpath("//form[@action='/signup']/button");
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



    @Given("user in home page")
    public void user_in_home_page(){
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://automationexercise.com/");

    }

    @When("user click on signup login")
    public void userClickOnSignupLogin() {

        Hooks.driver.findElement(signupLoginBy).click();

    }

    @Then("user navigate to Signup Login page")
    public void userNavigateToSignupLoginPage() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://automationexercise.com/login");


    }


    @When("user enter a new name and email address")
    public void userEnterANewNameAndEmailAddress() {
        Hooks.driver.findElement(userNameSignUpBy).sendKeys("eeeaaaaaaa");
        Hooks.driver.findElement(emialSignUpBy).sendKeys("eeeaaaaaaa@gmail.com");

    }


    @And("click on Signup button")
    public void clickOnSignupButton() {
        Hooks.driver.findElement(signUpBtnBy).click();

    }


    @Then("user navigate to Signup page")
    public void userNavigateToSignupPage() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://automationexercise.com/signup");

    }



    @When("user enter a Password, First name, Last name, Address, State, City, Zipcode and Mobile Number")
    public void userEnterAPasswordFirstNameLastNameAddressStateCityZipcodeAndMobileNumber() {
        Hooks.driver.findElement(passwordBy).sendKeys("123");
        Hooks.driver.findElement(firstNameBy).sendKeys("eeea");
        Hooks.driver.findElement(lastNameBy).sendKeys("eesas");
        Hooks.driver.findElement(addressBy).sendKeys("123 cairo egypt");
        Hooks.driver.findElement(cityBy).sendKeys("cairo");
        Hooks.driver.findElement(stateBy).sendKeys("cairoo");
        Hooks.driver.findElement(ZipcodeBy).sendKeys("123");
        Hooks.driver.findElement(mobileNumberBy).sendKeys("123");

    }

    @And("the user selects country {string}")
    public void theUserSelectsCountry(String countryName) {
        WebElement countryElement = Hooks.driver.findElement(countryBy);
        Select select = new Select(countryElement);
        select.selectByVisibleText(countryName);
    }



    @And("click on Create Account button")
    public void clickOnCreateAccountButton() {
        Hooks.driver.findElement(createAccountButtonBy).click();

    }


    @Then("“ACCOUNT CREATED!” message appears")
    public void accountCREATEDMessageAppears() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://automationexercise.com/account_created");


    }



}
