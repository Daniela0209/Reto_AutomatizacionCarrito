package com.co.daniela.webproject.test.page.addtocar.addcarcolor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCarColorDressesPage {


    @CacheLookup
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    WebElement dresses;

    @CacheLookup
    @FindBy(id = "color_13")
    WebElement dressesColor13;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
    WebElement imgDressesColor13;

    @CacheLookup
    @FindBy(id = "color_16")
    WebElement DressesColor16;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img")
    WebElement imgDressesColor16;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"add_to_cart\"]/button/span")
    WebElement addToCarButton;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")
    WebElement continueShopping;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    WebElement proceedCheckout;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
    WebElement summaryProceedCheckout;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button/span")
    WebElement addresProceedCheckout;


    public WebElement getDresses() {
        return dresses;
    }

    public WebElement getDressesColor13() {
        return dressesColor13;
    }

    public WebElement getImgDressesColor13() {
        return imgDressesColor13;
    }

    public WebElement getDressesColor16() {
        return DressesColor16;
    }

    public WebElement getImgDressesColor16() {
        return imgDressesColor16;
    }

    public WebElement getAddToCarButton() {
        return addToCarButton;
    }

    public WebElement getContinueShopping() {
        return continueShopping;
    }

    public WebElement getProceedCheckout() {
        return proceedCheckout;
    }

    public WebElement getSummaryProceedCheckout() {
        return summaryProceedCheckout;
    }

    public WebElement getAddresProceedCheckout() {
        return addresProceedCheckout;
    }


    public AddCarColorDressesPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

}
