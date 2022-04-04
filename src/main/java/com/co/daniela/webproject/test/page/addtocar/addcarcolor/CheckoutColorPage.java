package com.co.daniela.webproject.test.page.addtocar.addcarcolor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutColorPage {

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span/i")
    WebElement checkoutReadyColor;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\'center_column\']/form/p/button/span/i")
    WebElement realizedPaymentColor;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\'form\']/p/button/span/i")
    WebElement checkoutAndShippingColor;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"form\"]/div/p[2]/label")
    WebElement termsAndConditionsColor;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\'HOOK_PAYMENT\']/div[2]/div/p/a")
    WebElement checkPaymentColor;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\'cart_navigation\']/button")
    WebElement makeAnOrderColor;

    public WebElement getCheckoutReadyColor() {
        return checkoutReadyColor;
    }

    public WebElement getRealizedPaymentColor() {
        return realizedPaymentColor;
    }

    public WebElement getCheckoutAndShippingColor() {
        return checkoutAndShippingColor;
    }

    public WebElement getTermsAndConditionsColor() {
        return termsAndConditionsColor;
    }

    public WebElement getCheckPaymentColor() {
        return checkPaymentColor;
    }

    public WebElement getMakeAnOrderColor() {
        return makeAnOrderColor;
    }
    public CheckoutColorPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

}
