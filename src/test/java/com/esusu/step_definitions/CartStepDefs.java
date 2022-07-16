package com.esusu.step_definitions;

import com.esusu.pages.Add2ItemsToCart;
import com.esusu.utilities.BrowserUtil;
import com.esusu.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class CartStepDefs {

    Add2ItemsToCart add = new Add2ItemsToCart();
    Actions actions=new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Given("user is successfully logged to store")
    public void userIsSuccessfullyLoggedToStore() {

        add = new Add2ItemsToCart();
        add.go_To();
        BrowserUtil.waitFor(3);
        add.signin_to.click();
        BrowserUtil.waitFor(3);
        add.loginAccess();
        BrowserUtil.waitFor(3);
        add.womenTab.click();
        BrowserUtil.waitFor(3);


    }

    @And("user selects item one")
    public void userSelectsItem() {
        js.executeScript("arguments[0].scrollIntoView(true)" , Driver.getDriver().findElement(By.xpath("(//a[@title='Specials'])[1]")));
        BrowserUtil.waitFor(2);



        add.item1.click();
        BrowserUtil.waitFor(2);

        add.item2.click();
        BrowserUtil.waitFor(2);

        add.addCart.click();
        BrowserUtil.waitFor(2);



    }



    @Then("There are two items in your cart message is displayed")
    public void thereAreItemsInYourCartMessageIsDisplayed() {

        String cartItems = add.numberOfItems.getText();
        System.out.println(cartItems);

        Assert.assertEquals(cartItems, "2");

    }

    @When("user selects proceed to logout")
    public void userSelectsProceedToLogout() {

        add.proceed1.click();
        BrowserUtil.waitFor(2);

        add.proceed2.click();
        BrowserUtil.waitFor(2);

        add.proceed3.click();
        BrowserUtil.waitFor(2);

        add.checkBoxBtn.click();

        add.proceed4.click();
        BrowserUtil.waitFor(2);

    }

    @And("user checks payment method")
    public void userChecksPaymentMethod() {

        add.payment.click();
        BrowserUtil.waitFor(2);




    }

    @Then("user should successfully place order")
    public void userShouldSuccessfullyPlaceOrder() {

        add.confirmOrder.click();
        BrowserUtil.waitFor(2);

        Assert.assertTrue(add.confirmationMsg.isDisplayed());
    }
}
