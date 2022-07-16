package com.esusu.step_definitions;

import com.esusu.pages.VerifyOrderHistory;
import com.esusu.utilities.BrowserUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderHistoryStepDef {
    VerifyOrderHistory verify = new VerifyOrderHistory();;
    @Given("user is successfully logged in to store")
    public void userIsSuccessfullyLoggedInToStore() {
        verify.go_To();
        BrowserUtil.waitFor(3);
        verify.signin_to.click();
        BrowserUtil.waitFor(3);
        verify.loginVerify();
        BrowserUtil.waitFor(3);


    }

    @When("user clicks order history and details option")
    public void userClicksOrderHistoryAndDetailsOption() {

        verify.ordersOption.click();
        BrowserUtil.waitFor(1);
    }

    @Then("user can view their order history")
    public void userCanViewTheirOrderHistory() {

        verify.orderMessage.isDisplayed();
    }
}
