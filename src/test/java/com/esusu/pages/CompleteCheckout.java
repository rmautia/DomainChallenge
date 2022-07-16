package com.esusu.pages;

import com.esusu.utilities.BrowserUtil;
import com.esusu.utilities.ConfigReader;
import com.esusu.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompleteCheckout {

    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    public WebElement signin_to;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement login_Email;

    @FindBy(xpath = "//input[@id='passwd']")
    public WebElement login_Password;

    @FindBy(xpath = "//button[@id='SubmitLogin']")
    public WebElement login_Button;

    @FindBy(xpath = "//a[normalize-space(text()) = 'Printed Chiffon Dress']")
    public WebElement item1;

    @FindBy(className = "continue")
    public WebElement continueShopping;

    @FindBy(xpath = "//*[@id=\"quantity_wanted_p\"]/a[2]")
    public WebElement item2;

    @FindBy(xpath = "//span[@class=\"ajax_cart_quantity\"]")
    public WebElement numberOfItems;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    public WebElement womenTab;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
    public WebElement hoverBtn;

    @FindBy(xpath = "//*[@id=\"add_to_cart\"]/button")
    public WebElement addCart;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    public WebElement proceed1;

    @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
    public WebElement proceed2;

    @FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button/span")
    public WebElement proceed3;

    @FindBy(xpath = "//*[@id=\"form\"]/p/button/span")
    public WebElement proceed4;

    @FindBy(id="cgv")
    public WebElement checkBoxBtn;

    @FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
    public WebElement payment;


    @FindBy(xpath = "//*[@id=\"cart_navigation\"]/button/span")
    public WebElement confirmOrder;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/p/strong")
    public WebElement confirmationMsg;


    public CompleteCheckout() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void goTo() {
        Driver.getDriver().navigate().to(ConfigReader.read("mystore_url"));
    }

    public void loginAccess(){
        this.signin_to.click();
        BrowserUtil.waitFor(2);
        this.login_Email.sendKeys(ConfigReader.read("username"));
        this.login_Password.sendKeys(ConfigReader.read("password"));
        this.login_Button.click();

    }



}
