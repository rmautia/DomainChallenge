package com.esusu.pages;

import com.esusu.utilities.ConfigReader;
import com.esusu.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyOrderHistory {

    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    public WebElement signin_to;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement login__Email;

    @FindBy(xpath = "//input[@id='passwd']")
    public WebElement login__Password;

    @FindBy(xpath = "//button[@id='SubmitLogin']")
    public WebElement login__Button;

    @FindBy(xpath = "//a[@title='Orders']")
    public WebElement ordersOption;

    @FindBy(className = "info-title")
    public WebElement orderMessage;

    public VerifyOrderHistory() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void go_To() {
        Driver.getDriver().navigate().to(ConfigReader.read("mystore_url"));
    }

    public void loginVerify(){


        this.login__Email.sendKeys(ConfigReader.read("username"));
        this.login__Password.sendKeys(ConfigReader.read("password"));
        this.login__Button.click();

    }
}
