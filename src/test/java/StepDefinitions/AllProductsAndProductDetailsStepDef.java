package StepDefinitions;

import Hooks.Hooks;
import Pages.ProductPages.ProductDetailsPage;
import Pages.HomePage;
import Pages.ProductPages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class AllProductsAndProductDetailsStepDef {

    HomePage homePage=new HomePage(Hooks.driver);
    ProductDetailsPage productDetailsPage;
    ProductPage productPage;


    @Then("the products list should be visible")
    public void visibilityOfProductsList(){
        productPage=homePage.goToProductsPage();
        Assert.assertTrue(productPage.visibilityOfProductsList());


    }

    @And("the user opens {int} product from the list")
    public void theUserOpensAnyProductFromTheList(int poductNumber) {
        productDetailsPage=productPage.theUserOpensAnyProductFromTheList(poductNumber);
        Assert.assertTrue(productDetailsPage.theCorrectProductDetailsShouldBeDisplayed());


    }

    @Then("the correct product details should be displayed")
    public void theCorrectProductDetailsShouldBeDisplayed() {
        productDetailsPage.theCorrectProductDetailsShouldBeDisplayed();

    }


    @Then("user enter invalid search text data")
    public void userEnterInvalidSearchTextData() {
        productPage = homePage.goToProductsPage();
        productPage.userEnterInvalidSearchTextData();

    }

    @And("click on search icon")
    public void clickOnSearchIcon() {

        productPage.clickOnSearchIcon();
    }

    @Then("the products page displayed empty")
    public void theProductsPageDisplayedEmpty() {
        Assert.assertTrue(productPage.theProductsPageDisplayedEmpty());

    }





}
