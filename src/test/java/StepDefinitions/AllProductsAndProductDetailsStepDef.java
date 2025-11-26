package StepDefinitions;

import Hooks.Hooks;
import Pages.AllProductsAndProductDetails.AllProductsPage;
import Pages.AllProductsAndProductDetails.ProductDetailsPage;
import Pages.HomePage;
import Pages.ProductPages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class AllProductsAndProductDetailsStepDef {

    HomePage homePage=new HomePage(Hooks.driver);
    ProductDetailsPage productDetailsPage;
    AllProductsPage allProductsPage;


    @Then("the products list should be visible")
    public void visibilityOfProductsList(){
        allProductsPage=homePage.goToAllProductsPage();
        Assert.assertTrue(allProductsPage.visibilityOfProductsList());


    }

    @And("the user opens {int} product from the list")
    public void theUserOpensAnyProductFromTheList(int poductNumber) {
        productDetailsPage=allProductsPage.theUserOpensAnyProductFromTheList(poductNumber);
        Assert.assertTrue(productDetailsPage.theCorrectProductDetailsShouldBeDisplayed());


    }

    @Then("the correct product details should be displayed")
    public void theCorrectProductDetailsShouldBeDisplayed() {
        productDetailsPage.theCorrectProductDetailsShouldBeDisplayed();

    }


    @Then("user enter invalid search text data")
    public void userEnterInvalidSearchTextData() {
        allProductsPage = homePage.goToAllProductsPage();
        allProductsPage.userEnterInvalidSearchTextData();

    }

    @And("click on search icon")
    public void clickOnSearchIcon() {

        allProductsPage.clickOnSearchIcon();
    }

    @Then("the products page displayed empty")
    public void theProductsPageDisplayedEmpty() {
        Assert.assertTrue(allProductsPage.theProductsPageDisplayedEmpty());
    }



}
