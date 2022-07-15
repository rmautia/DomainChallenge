package com.esusu.pages;

import com.esusu.utilities.BrowserUtil;
import com.esusu.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    @FindBy(xpath = "//input[@id='email']")
    public WebElement loginEmail;

    @FindBy(xpath = "//input[@id='passwd']")
    public WebElement loginPassword;

    @FindBy(xpath = "//button[@id='SubmitLogin']")
    public WebElement loginButton;

    public Login() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void login(String userName, String password){

        this.loginEmail.sendKeys(userName);
        this.loginPassword.sendKeys(password);
        this.loginButton.click();

        BrowserUtil.waitFor(1);
    }
}
