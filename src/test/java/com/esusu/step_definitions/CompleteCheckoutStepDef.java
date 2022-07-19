package com.esusu.step_definitions;

import com.esusu.pages.Add2ItemsToCart;
import com.esusu.pages.CompleteCheckout;
import com.esusu.utilities.BrowserUtil;
import com.esusu.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;


public class CompleteCheckoutStepDef {

    CompleteCheckout checkout = new CompleteCheckout();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Given("user is logged to store")
    public void userIsSuccessfullyLoggedToStore() {

        checkout.goTo();
        BrowserUtil.waitFor(3);
        checkout.signin_to.click();
        BrowserUtil.waitFor(3);
        checkout.loginAccess();
        BrowserUtil.waitFor(3);
        checkout.womenTab.click();
        BrowserUtil.waitFor(3);


    }

    @And("user adds two items to cart")
    public void userSelectsTwoItemsToTheCart() {

        js.executeScript("arguments[0].scrollIntoView(true)",
                Driver.getDriver().findElement(By.xpath("(//a[@title='Specials'])[1]")));

        BrowserUtil.waitFor(2);

        checkout.item1.click();
        BrowserUtil.waitFor(2);

        checkout.item2.click();
        BrowserUtil.waitFor(2);

        checkout.addCart.click();
        BrowserUtil.waitFor(2);
    }

    @When("user selects proceeds to checkout")
    public void userSelectsProceedsToCheckout() {

        checkout.proceed1.click();
        BrowserUtil.waitFor(2);

        checkout.proceed2.click();
        BrowserUtil.waitFor(2);

        checkout.proceed3.click();
        BrowserUtil.waitFor(2);

        checkout.checkBoxBtn.click();

        checkout.proceed4.click();
        BrowserUtil.waitFor(2);
    }


    @And("user checks payment method")
    public void userChecksPaymentMethod() {

        checkout.payment.click();
        BrowserUtil.waitFor(2);


    }

    @Then("user should successfully place order")
    public void userShouldSuccessfullyPlaceOrder() {

        checkout.confirmOrder.click();
        BrowserUtil.waitFor(2);

        Assert.assertTrue(checkout.confirmationMsg.isDisplayed());
    }



}
