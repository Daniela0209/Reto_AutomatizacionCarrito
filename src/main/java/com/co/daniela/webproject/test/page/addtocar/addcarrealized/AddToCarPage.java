package com.co.daniela.webproject.test.page.addtocar.addcarrealized;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCarPage {

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    WebElement dresses;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")
    WebElement addDresses1;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
    WebElement imageDresses1;


    @CacheLookup
    @FindBy(xpath ="//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]/span" )
    WebElement addDresses2;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img")
    WebElement imageDresses2;


    @CacheLookup
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[4]/div/div[2]/div[2]/a[1]/span")
    WebElement addDresses3;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[4]/div/div[1]/div/a[1]/img")
    WebElement imageDresses3;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")
    WebElement continueShopping;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    WebElement proceedToCheckout;


    public WebElement getDresses() {
        return dresses;
    }

    public WebElement getAddDresses1() {
        return addDresses1;
    }

    public WebElement getImageDresses1() {
        return imageDresses1;
    }

    public WebElement getAddDresses2() {
        return addDresses2;
    }

    public WebElement getImageDresses2() {
        return imageDresses2;
    }

    public WebElement getAddDresses3() {
        return addDresses3;
    }

    public WebElement getImageDresses3() {
        return imageDresses3;
    }

    public WebElement getContinueShopping() {
        return continueShopping;
    }

    public WebElement getProceedToCheckout() {
        return proceedToCheckout;
    }

    public AddToCarPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
}
