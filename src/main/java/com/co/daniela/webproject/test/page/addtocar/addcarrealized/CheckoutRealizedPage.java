package com.co.daniela.webproject.test.page.addtocar.addcarrealized;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutRealizedPage {

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span/i")
    WebElement checkoutReady;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\'center_column\']/form/p/button/span/i")
    WebElement realizedPayment;


    @CacheLookup
    @FindBy(xpath = "//*[@id=\'form\']/p/button/span/i")
    WebElement checkoutAndShipping;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\'form\']/div/p[2]/label")
    WebElement termsAndConditions;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\'HOOK_PAYMENT\']/div[2]/div/p/a")
    WebElement checkPayment;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\'cart_navigation\']/button")
    WebElement makeAnOrder;

    public WebElement getCheckoutReady() {
        return checkoutReady;
    }

    public WebElement getRealizedPayment() {
        return realizedPayment;
    }

    public WebElement getCheckoutAndShipping() {
        return checkoutAndShipping;
    }

    public WebElement getTermsAndConditions() {
        return termsAndConditions;
    }

    public WebElement getCheckPayment() {
        return checkPayment;
    }

    public WebElement getMakeAnOrder() {
        return makeAnOrder;
    }

    public CheckoutRealizedPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
